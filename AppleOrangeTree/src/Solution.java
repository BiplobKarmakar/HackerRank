import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

     int p=apples.length;
     int q=oranges.length;
     int applecount=0;
     int orangecount=0;
     int[] fallsapple=new int[p];
     int[] fallsornage=new int[q];

     for (int i=0;i<p;i++)
     {
         fallsapple[i]=a+apples[i];
         if(fallsapple[i]>=s && fallsapple[i]<=t)
             applecount++;
     }
        for (int j=0;j<q;j++)
        {
            fallsornage[j]=b+oranges[j];
            if(fallsornage[j]>=s && fallsornage[j]<=t)
                orangecount++;
        }
        System.out.println(applecount);
        System.out.println (orangecount);
    }

  //  private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       // String[] st = scanner.nextLine().split(" ");

        //int s = Integer.parseInt(st[0]);
           int s=7;
        //int t = Integer.parseInt(st[1]);
          int t=11;
      //  String[] ab = scanner.nextLine().split(" ");

       // int a = Integer.parseInt(ab[0]);
         int a=5;
     //   int b = Integer.parseInt(ab[1]);
         int b=15;
      //  String[] mn = scanner.nextLine().split(" ");

       // int m = Integer.parseInt(mn[0]);
           int m=3;
      //  int n = Integer.parseInt(mn[1]);
             int n=2;
        int[] apples = new int[]{-2,2,1};

//        String[] applesItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < m; i++) {
//            int applesItem = Integer.parseInt(applesItems[i]);
//            apples[i] = applesItem;
//        }

        int[] oranges = new int[]{5,-6};

//        String[] orangesItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < n; i++) {
//            int orangesItem = Integer.parseInt(orangesItems[i]);
//            oranges[i] = orangesItem;
//        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

       // scanner.close();
    }
}
