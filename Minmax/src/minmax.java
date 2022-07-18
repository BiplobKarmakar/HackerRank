import java.util.Collections;
import java.util.Arrays;

public class minmax {
    public static void main(String args[])
    {
        long arr[]={1,2,3,4,5};

        Arrays.sort (arr);

        long l=arr.length;
        long  min=0L,max=0L;
                int i,j;

        for(i=0;i<=l-2;i++)
            min=(long)(min+arr[i]);

       // System.out.println(min);

        for(i=1;i<=l-1;i++)
            max=max+arr[i];
        System.out.println(min +"  "+ max);
    }
}
