import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static String fairRations(List<Integer> B) {
        // Write your code here
        int n=B.size ();
        int count=0;

        for(int i=n-1;i>0;i--)
        {
            int last=B.get (i);
            if(last%2==1)
            {
                B.set (i,last+1);
                B.set (i-1, B.get (i-1)+1);
                count=count+2;
            }

        }
        String result="NO";
        for(int j:B) {
            if(j%2!=0)
                return result;
        }

        return String.valueOf (count);
    }

    public static void main(String[] args) {

        List<Integer> a= new ArrayList<> (Arrays.asList (1,2));
        String result=fairRations (a);
        System.out.println (result);

    }
}
