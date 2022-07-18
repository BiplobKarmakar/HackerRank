import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
//    static String timeConversion(String s) {
//        /*
//         * Write your code here.
//         *
//         */
//
//        String[] st= s.split(":");
//
//
//    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = "07:05:45PM";
        String st[] = s.split (":");
        String last, tformate;//, ampmremove;

        System.out.println (st[0] + st[1] + st[2]);

        int hh = Integer.parseInt (st[0]);

        if (s.contains ("AM")&&hh == 12) {
            hh = 0;
             last= st[2].replace ("AM", "");
        }
        if (s.contains ("PM")&&hh < 12)
        {
            hh = hh + 12;
        last= st[2].replace ("PM", "");
    }

        if(hh<10)
             tformate= "0"+hh+":"+st[1]+":"+st[2].replace ("AM","");
        else
            tformate = hh+":"+st[1]+":"+st[2].replace ("PM","" ); //ampmremove;

          System.out.println (tformate);

    }
}
