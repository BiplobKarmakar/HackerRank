import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solutions {
    public static List<Integer> quartiles(List<Integer> arr) {
        // Write your code here
        //Arrays.sort(numbers);
        Collections.sort(arr);
        List<Integer> result=new ArrayList<> (Arrays.asList (0,0,0));

        int Q2Val = findMedianHelper(arr, 0, arr.size() - 1);
        int Q1Val = findMedianHelper(arr, 0, arr.size() / 2 - 1);
        int Q3Val = findMedianHelper(arr, arr.size() % 2 == 0 ? arr.size() / 2 : arr.size() / 2 + 1, arr.size() - 1);
        result.set(1,Q2Val);
        result.set(0,Q1Val);
        result.set(2,Q3Val);

        // System.out.format("%d\n%d\n%d\n", Q1Val, Q2Val, Q3Val);
        return result;
    }

    public static int findMedianHelper(List<Integer> arr, int lo, int hi) {
        int a=arr.get((lo + hi) / 2 );
        int b=arr.get((lo + hi + 1) / 2) ;
        return (a+ b)  / 2;
    }


    public static void main(String[] args) {
        //3 7 8 5 12 14 21 13 18  arr = [3, 7, 8, 5, 12, 14, 21, 13,18]

         List<Integer> arr= new ArrayList<Integer> (Arrays.asList
          (3, 7, 8, 5, 12, 14, 21, 15,18,14));
        //  List<Integer> arr=new ArrayList<> (Arrays.asList (3, 7, 8, 5, 12, 14, 21, 13,18));
       // 3 7 8 5 12 14 21 15 18 14

        // List<Integer> arr=new ArrayList<> (Arrays.asList (9,5,7,1,3));
        // List<Integer> arr=new ArrayList<> (Arrays.asList (5,7,1,3));
        List<Integer> result=
                quartiles (arr);
        //Collections.sort (arr);
        System.out.println (result);

    }
}
