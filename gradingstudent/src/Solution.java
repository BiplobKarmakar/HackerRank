import java.util.*;


public class Solution {


//input  73 67 38 33
    //output       75 67  40 33

    public static void main(String args[])
    {
        List<Integer> grades =new ArrayList<Integer> (Arrays.asList (73, 67, 38, 33));
        List<Integer> result =new ArrayList<Integer> ();
        int n = grades.size ();//.length;


        for(Integer g: grades)
        {

            if(g >=38) {
                int div = g / 5;
                int fivefold = 5 * (div + 1);
                if (fivefold - g<3) {
                    result.add (fivefold);
                }
                else {
                    result.add (g);
                }
            }
            else
            result.add(g);
        }
        //for (Integer r:result)
           // System.out.print (r);
        return result;

    }
}