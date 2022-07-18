import java.io.*;
import java.util.*;

public class oddevencharacter {



    public static void main(String args[])
    {
       int j;
        String[] arr=new String[20];


        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for( j=0;j<number;j++) {
           //Scanner sa = new Scanner (System.in);
            arr[j] = sc.next ();
        }
        for( j=0;j<number;j++) {
            int n = arr[j].length ();
           // char[] strodd = new char[n];
            //char[] streven = new char[n];
            String evenstring="",oddstring="";
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0)
                    evenstring += arr[j].charAt (i);
                else
                    oddstring += arr[j].charAt (i);
            }
               System.out.println (evenstring+" "+oddstring);
                    }



    }
}
