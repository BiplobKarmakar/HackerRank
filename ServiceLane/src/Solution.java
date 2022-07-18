import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//        5 5
//        1 2 2 2 1
//        2 3
//        1 4
//        2 4
//        2 4
//        2 3
//2 1 1 1 2

public class Solution {
    public static List<Integer> serviceLane
            (int n,List<Integer> width, List<List<Integer>> cases) {
        // Write your code here
        Integer[] w=new Integer[n];
        //width.toArray(w);
        w= width.toArray(w);



        List<Integer> result=new ArrayList<> ();

        for(List<Integer> a:cases)
        {
            int begin=a.get (0);
            int end=a.get (1);
            int min=Integer.MAX_VALUE;

            while(begin<=end)
            {
                if(w[begin]<min)
                    min=w[begin];
                begin++;
            }
            result.add (min);
        }

       return result;
    }


    public static void main(String[] args) {
        int n=5;
        int t=5;
        //int[] width=new int[]{1, 2, 2, 2, 1};
        List<Integer> width=new ArrayList<> (Arrays.asList (1, 2, 2, 2, 1));
//        List<List<Integer>> cases=new ArrayList<>(Arrays.asList
//                ((0, 3), (4, 6), (6, 7), (3, 5), (0, 7)));
        List<List<Integer>> cases = new ArrayList<> ();
        cases.add(Arrays.asList(2, 3));
        cases.add(Arrays.asList(1, 4));
        cases.add(Arrays.asList(2, 4));
        cases.add(Arrays.asList(2, 4));
        cases.add(Arrays.asList(2, 3));
        List<Integer> result=serviceLane (n,width,cases);
        System.out.println (result);

//        for(List<Integer> a:cases)
//        {
//            for(int i:a)
//            {
//                System.out.print (i+" ");
//            }
//            System.out.println ();
//        }

    }
}
