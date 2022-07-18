import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner =new Scanner (System.in);
        int bday= scanner.nextInt ();
        int bmonth=scanner.nextInt ();
        int byear=scanner.nextInt ();

        int rday= scanner.nextInt ();
        int rmonth=scanner.nextInt ();
        int ryear=scanner.nextInt ();
        int dyear=0;
        int dmonth=0;
        int ddays=0;
        if (byear>ryear)
            dyear=byear-ryear;
        else {

            LocalDate rdate = LocalDate.of (byear, bmonth, bday);
            LocalDate bdate = LocalDate.of (ryear, rmonth, rday);
            Period diff = Period.between (bdate, rdate);

            dyear = diff.getYears ();
            dmonth = diff.getMonths ();
             ddays = diff.getDays ();
        }
        if(dyear>0)
        {

            System.out.print(10000);
            dmonth=0;
            ddays=0;
        }
        else  if(dmonth>0)
        {
            System.out.print(dmonth*500);
            ddays=0;
        }
        else  if(ddays>0)
            System.out.print(ddays*15);

        else
        {
            System.out.print(0);
        }
    }
}