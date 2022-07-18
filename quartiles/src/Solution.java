import java.util.*;
import java.util.Collections;

public class Solution {
    public static List<Integer> quartiles(List<Integer> arr) {
        // Write your code here
        List<Integer> result=new ArrayList<> (Arrays.asList (0,0,0));
        Collections.sort (arr);

        int firstnumber=0, seceondnumber=0,Q1=0,mid=0,Q2=0,lastnumber=0,seceondlatnumber=0;
        int Q3=0, firsthalf=0,firstsum=0;
        int len=arr.size ();

//        if (n is odd)
//        {
//            if both sides are odd
//            if both sides are even
//        }
//        if n is even
//        {//1,2,3,4,5
//            if both sides are odd
//            if both sides are even
//
//        }

         if(len%2!=0)
        {
             firsthalf=len/2;
             if(firsthalf%2==0)// both half are even
             {
                 firstnumber=arr.get (firsthalf/2);
                 seceondnumber=arr.get(firsthalf/2-1);

                 Q1=(firstnumber+seceondnumber)/2;

                 result.set (0,Q1);
                 firstnumber=arr.get (firsthalf+firsthalf/2);
                 seceondnumber=arr.get (firsthalf+firsthalf/2+1);
                 Q3=(firstnumber+seceondnumber)/2;
                 result.set (2,Q3);

             }
             else //both half are odd
             {
                 Q1=arr.get (firsthalf/2);
                 result.set (0,Q1);
                 Q3=arr.get (firsthalf+firsthalf/2);
                 result.set (2,Q3);


             }
             Q2=arr.get (len/2);
             result.set (1,Q2);
            }

        if(len%2==0) {
            firstnumber = arr.get (len / 2);
            seceondnumber = arr.get (len / 2 - 1);
            Q2 = (firstnumber + seceondnumber) / 2;
            result.set (1, Q2);
            firsthalf=len/2-1;
            if (firsthalf % 2 == 0) {
                firstnumber = arr.get (firsthalf / 2);
                seceondnumber = arr.get (firsthalf / 2 - 1);

                Q1 = (firstnumber + seceondnumber) / 2;

                result.set (0, Q1);
                firstnumber = arr.get (firsthalf + firsthalf / 2);
                seceondnumber = arr.get (firsthalf + firsthalf / 2 + 1);
                Q3 = (firstnumber + seceondnumber) / 2;
                result.set (2, Q3);


            } else {
                Q1 = arr.get (firsthalf / 2);
                result.set (0, Q1);
                Q3 = arr.get (len/2 + firsthalf );
                result.set (2, Q3);

            }
        }
        return result;
    }

    public static void main(String[] args) {
        //3 7 8 5 12 14 21 13 18  arr = [3, 7, 8, 5, 12, 14, 21, 13,18]

      //  List<Integer> arr= new ArrayList<Integer> (Arrays.asList (3, 7, 8, 5, 12, 14, 21, 13,18,22));
        List<Integer> arr=new ArrayList<> (Arrays.asList (3, 7, 8, 5, 12, 14, 21, 13,18));
       // List<Integer> arr=new ArrayList<> (Arrays.asList (9,5,7,1,3));
     // List<Integer> arr=new ArrayList<> (Arrays.asList (5,7,1,3));
       List<Integer> result=
                quartiles (arr);
       //Collections.sort (arr);
        System.out.println (result);



    }
}
