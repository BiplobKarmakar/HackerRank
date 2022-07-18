
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String args[])
    {

     int arr[]={-4,3, -9, 0, 4, 1 };
     int n=arr.length;
        double positive=0,negative=0, zeros=0;
        double occurencepositive = 0;//(positive/n);
        double occurencenegative=0;//negative/n;
        double occurencezeros=0;//zeros/n;
     for(int i=0;i<=n-1;i++)
     {
        if(arr[i]>0)
            positive++;
        else if(arr[i]<0)
            negative++;
        else if(arr[i]==0)
            zeros++;
     }


       System.out.println (positive/n);
        System.out.println (negative/n);
        System.out.println (zeros/n);
        
    }
}
