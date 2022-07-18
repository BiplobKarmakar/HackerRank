import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean ladyBugs(String s,int n)
    {
        boolean flag_uscores=false,flag_letter=false;
        int[] arr=new int[26];
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='_')
                flag_uscores=true;
            else
                flag_letter=true;
            if(s.charAt(i)!='_')
                arr[s.charAt(i)-'A']++;
        }
        if(flag_uscores==true&&flag_letter==false)
            return true;
        else if(flag_uscores==false&&flag_letter==true)
        {
            if(s.length()==1)
            return false;
            if(s.charAt(0)!=s.charAt(1)||s.charAt(n-2)!=s.charAt(n-1))
                return false;
            else
                for(int i=1;i<n-1;i++)
                {
                    if(!(s.charAt(i)==s.charAt(i-1)||s.charAt(i)==s.charAt(i+1)))
                        return false;
                }
            return true;
        }
        else
        {
            for(int i=0;i<26;i++)
                if(arr[i]==1)
                    return false;
            return true;
        }
    }



    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int Q = in.nextInt();
//        for(int a0 = 0; a0 < Q; a0++){
//            int n = in.nextInt();
//            String b = in.next();
        //String b="DD__FQ_QQF";
        String b="YYRRBB";
          int n=b.length ();
        boolean result=ladyBugs(b,n);
            if(result==true)
                System.out.println("YES");
            else
                System.out.println("NO");

    }
}

