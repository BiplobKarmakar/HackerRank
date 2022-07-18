public class Solution {
    public static int libraryFine(
            int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here
        int fine =0;
        if(y2==y1 && m2==m1&& d2>=d1)
        {
             fine=0;
            // return fine;

        }


        else if(y1>y2)
        {
            fine= 10000;
            //return fine;
        }

        else if (y2==y1 && m1>m2) {
            fine= 500 * (m1 - m2);
            //return fine;
        }
        else if(y2==y1 && m2==m1&& d2<d1)
        {
            fine= 15*(d1-d2);
            //return fine;
        }
          return fine;

         // return fine;

    }

    public static void main(String[] args) {
        //9 6 2015  return date fine 45
        //6 6 2015 expected return date

      int result=  libraryFine (9, 6, 2015,6, 6, 2015);
        System.out.println (result);

    }
}
