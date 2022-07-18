import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static long arrayManipulation(int n, List<List<Integer>> queries)
    {

        long arr[]=new long[n];
        long max=0;
        for(List<Integer> query:queries){
            int l=query.get(0);
            int r=query.get(1);
            int k=query.get(2);
            arr[l-1]+=k;
            if(r!=n){
                arr[r]+=-k;
            }

        }
        for(int i=1;i<n;i++){
             arr[i]=arr[i]+arr[i-1];
            if(arr[i]>max)
                max=arr[i];
        }
        return max;



    }


}
