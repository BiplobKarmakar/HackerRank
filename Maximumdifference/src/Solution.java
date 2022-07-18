import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;
    Difference(int a[])
    {
        this.elements=a;
    }
    // Add your code here

    int  computeDifference()
    {
        int n= elements.length;
        int maxvalue=Integer.MIN_VALUE;
        int minvalue=Integer.MAX_VALUE;

        for(int i=0;i<=n-1;i++)
        {
            if (elements[i]<minvalue) minvalue = elements[i];
            if (elements[i]>maxvalue) maxvalue = elements[i];
        }
        maximumDifference= maxvalue-minvalue;
        return maximumDifference;

    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
    //    3
        int[] a=new int[]{1, 2, 5};

        //sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
