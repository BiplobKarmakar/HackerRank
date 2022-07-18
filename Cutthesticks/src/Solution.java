import java.util.*;

public class Solution {
    public static List<Integer> cutTheSticks(List<Integer> arr) {
          //int minval=Integer.MAX_VALUE;
          int b=0;
        Collections.sort (arr);
         List<Integer> result=new ArrayList<> ();
        while(!arr.isEmpty ())
        {
           //int count=0;
           // for(int a:arr)
           // {
             //   if(arr.size ()==1)
             //       minval=arr.get (0);
              // else if(a<minval)
                    //minval=a;
           // }
            result.add(arr.size ());
            int minval=arr.get (0);
            for(int i=0;i<arr.size ();i++)
            {
               // if(arr.get (i)-minval>=0) {
                    b = arr.get (i) - minval;
                    //count++;
                    //arr.remove (0);
                    arr.set (i,b);

                //}
               }
           // result.add (count );
            arr.removeAll (Arrays.asList (0));
        }


        return result;

    }

    public static void main(String[] args) {

        List<Integer> a=new ArrayList<>
               // (Arrays.asList (1,2,3,4,3,3,2,1));
                (Arrays.asList (5, 4, 4, 2, 2, 8));

       List<Integer> b=cutTheSticks (a);
        System.out.println (b);

    }
}
