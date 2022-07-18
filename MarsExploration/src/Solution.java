public class Solution {
    public static int marsExploration(String s) {
        // Write your code here
        //String newstring=s.toUpperCase ();
        int j=0;
        int count =0;
         String comp="sos";
         int i=j;
        while(i<s.length ())
        {
            j=j+3;
            String sub=s.substring (i,j);
            i=j;
            if(!comp.equalsIgnoreCase (sub))
                count++;


        }
        return count;

    }

    public static void main(String[] args) {
        String s="OOS DSS OSO SWE WSO SOS OSO SOS OSS SSO SOS OSS";

        System.out.println (marsExploration (s));

    }
}
