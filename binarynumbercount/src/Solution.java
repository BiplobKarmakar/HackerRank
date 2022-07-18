import java.util.Arrays;
public class Solution {

    public static void main(String[] args) {
        int n=439;
         int[] a= new int[50];
         int []result=new int[50];
         int i=0,j, count=0;
        while (n!=0)
        {
           a[i]=n%2;
           n=n/2;
           i++;
        }
        int resultcount=0;
        for( j=i-1;j>=0;j--) {
            //count =0;
            if (a[j]== 1)
                count++;


           else {
                result[resultcount++]=count;
                count=0;
            }
        }
        if (count>1)
            result[resultcount]=count;
        System.out.print (Arrays.stream(result).max().getAsInt());
    }
}
