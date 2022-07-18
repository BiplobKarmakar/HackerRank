public class Solution
{


    public static int theLoveLetterMystery(String s)
    {
        // Write your code here
        StringBuilder str=new StringBuilder (s);
         int count=0;
         while(str.length ()>1) {
             char ch1 = str.charAt (0);
             char ch2 = str.charAt (str.length () - 1);
             if (ch1 != ch2) {
                 count = count + Math.abs ((int) ch1 - (int) ch2);
             }
             str.deleteCharAt (0);
             str.deleteCharAt (str.length () - 1);
         }
        return count;

    }

    public static void main(String[] args)
        {
        String s="cba";

        int n=theLoveLetterMystery (s);
        System.out.println (n);
    }

}
