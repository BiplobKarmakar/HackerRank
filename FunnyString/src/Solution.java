import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class Solution {
    public static List ASCIIvaluedifference(StringBuilder sbr)
    {
        List<Integer> l=new ArrayList<> ();

        for(int i=0;i<sbr.length ();i++)
        {
            int a=(int)sbr.charAt (i);
            l.add (a);
            // System.out.println (a);

        }

        List<Integer> dl=new ArrayList<> ();
        for(int j=0;j<l.size ()-1;j++)
        {
            dl.add (abs(l.get (j)-l.get (j+1)));
        }
        return dl;
    }
    public static String funnyString(String s) {
        // Write your code here
        StringBuilder sbr=new StringBuilder (s);
        StringBuilder strrev=new StringBuilder (s);
        strrev=strrev.reverse ();

        List<Integer> original= ASCIIvaluedifference ( sbr);
        List<Integer> reversel= ASCIIvaluedifference ( strrev);

        for(int j=0;j<original.size ();j++)
        {
            if(original.get (j)!=reversel.get (j))
            {
                return "Not Funny";
            }
        }


        return "Funny";

    }
    public static void main(String[] args) {

        String s="zxcb";
        System.out.println (funnyString (s));

    }
}
