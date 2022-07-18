import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static List<Integer>
    circularArrayRotation(List<Integer> a, int k, List<Integer> queries)
    {
        // Write your code here

       // int result[]=new int[nums.length];
        //int p=k%nums.length;
        int p=k%a.size ();
        //int a[]=new int[nums.length];
        List<Integer> b=new ArrayList<> ();

        for (int j=0,m=p;j<a.size ()-p;j++)
            b.add (a.get (j));
       // System.out.println (b);
           // a[m++]=nums[j];

        for(int i=a.size ()-p,l=0;i<a.size ();i++,l++)
          //  a[l++]=nums[i];
            b.add (l,a.get (i));
        List<Integer> result=new ArrayList<> ();
        System.out.println (b);
        for(int q:queries)
            result.add(b.get (q));
        System.out.println (result);


        return result;

    }
    public static void main(String[] args) {

        List<Integer> a=new ArrayList<> (Arrays.asList (1, 2, 3));
        int k=2;
        List<Integer> q=new ArrayList<> (Arrays.asList (0,1,2));
        List <Integer> result=circularArrayRotation
                ( a,k,q);
       // System.out.println (result);

    }
}
