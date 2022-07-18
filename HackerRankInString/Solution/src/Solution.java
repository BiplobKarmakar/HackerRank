public class Solution {
    public static String hackerrankInString(String s) {
        // Write your code here
        StringBuilder sb=new StringBuilder (s);

        String hr="hackerrank";//InString
        StringBuilder newhr= new StringBuilder();
        for(int i=0;i<hr.length ();i++)
        {
            char ch=hr.charAt (i);
            for(int j=0;j<sb.length ();j++)
            {
                char csb=sb.charAt (j);
                if(csb == ch) {
                   char cd = sb.charAt (j);
                   sb.delete(0,j+1);
                   newhr.append (cd);
                   j=0;
                   break;

                }

                    //deleteCharAt(int index)
            }
        }
      if ( hr.equals (newhr.toString ()))
        //System.out.println (newhr);
        return "YES";
      else
          return "NO";

    }


    public static void main(String[] args) {

        System.out.println (hackerrankInString ("hereiamstackerrank"));
    }
}
