import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the beautifulDays function below.
    static int reversenumber(int num)
    {
        int reversed =0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    static int beautifulDays(int i, int j, int k) {
         int count =0;
        for (int l=i;l<=j;l++)
        {
            int r=reversenumber(l);
            int diff= Math.abs (r-l);
            if(diff%k==0)
                count++;

        }
        return count;
    }

   // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       // String[] ijk = scanner.nextLine().split(" ");

        int i = 20;//Integer.parseInt(ijk[0]);

        int j = 23;//Integer.parseInt(ijk[1]);

        int k = 6;//Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);
        System.out.println (result);

       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

       // bufferedWriter.close();

       // scanner.close();
    }
}
