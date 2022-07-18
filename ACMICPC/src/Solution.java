import java.math.BigInteger;
import java.util.List;

public class Solution {
    public static List<Integer> acmTeam(List<String> topic) {
        // Write your code here

        BigInteger []number=new BigInteger[topic.size ()];

        for(int i=0;i<topic.size ();i++)
            number[i]=new BigInteger (topic.get (i),2);
        int bitcount=0;
        int maxnumber=0;
        int maxtopic=0;

        for (int i=0;i<topic.size();i++)
        {
            for(int j=i+1;j<topic.size();j++)
            {
               BigInteger bi=number[i].or(number[j]);
               bitcount=bi.bitCount ();
              // maxnumber++;
               if(bitcount>maxtopic)
               {
                   maxtopic=bitcount;
                   maxnumber=1;
               }
               else if(bitcount==maxtopic)
               {
                   maxnumber++;
               }
            }
        }

        List<Integer> result= List.of (maxtopic,maxnumber);
        return  result;

    }

    public static void main(String[] args) {

        List<String> topic= List.of ("10101",
                "11100",
                "11010",
                "00101");

        List<Integer> result= acmTeam (topic);
        System.out.println (result);

    }
}
