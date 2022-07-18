import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int count =0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ar[i]==ar[j] && ar[j]!=0)
                {
                    count++;
                    ar[j]=0;
                    ar[i]=0;
                    break;
                }
            }
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n =15;// scanner.nextInt();
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[]{6,5,2,3,5,2,2,1,1,5,1,3,3,3,5};

        //String[] arItems = scanner.nextLine().split(" ");
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

       // for (int i = 0; i < n; i++) {
        //    int arItem = Integer.parseInt(arItems[i]);
       //     ar[i] = arItem;
     //   }

        int result = sockMerchant(n, ar);
        System.out.println(result);

      //  bufferedWriter.write(String.valueOf(result));
      //  bufferedWriter.newLine();

       // bufferedWriter.close();

        //scanner.close();
    }
}
