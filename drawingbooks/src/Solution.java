import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int  pageCount(int n, int p) {
        /*
         * Write your code here.
         */
        int count =0;
        int count1=0;
        int k;
       // int i,j;
          // for( int i=1, j=n-1;i<p && j>p;i=i+2,j=j-2)
        for( int i=1;i<p;i=i+2)
        {
            count++;
        }
          if(n%2==0)
              k=n;
          else k=n-1;
        for(int j=k;j)
               count++;
           return count;

           //System.out.println(count);
    }

   // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n=6;
       // int n = scanner.nextInt();
      //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

       int p = 5;//scanner.nextInt();
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

       int result = pageCount(n, p);
        System.out.println(result);

       // bufferedWriter.write(String.valueOf(result));
      //  bufferedWriter.newLine();

        //bufferedWriter.close();

      //  scanner.close();
    }
}
