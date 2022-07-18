import java.util.HashMap;

public class Solution {
    public static String twoStrings(String s1, String s2) {
        // Write your code here

        HashMap<Character,Integer> hm=new HashMap<> ();

        for(char c:s1.toCharArray ())
        {
            if(hm.containsKey (c))
            {
                int count=hm.get (c);
                count++;
                hm.put (c,count);
            }
            else
            {
                int count=1;
                hm.put (c,count);
            }
        }
        //String result;
        for(char ch:s2.toCharArray ())
        {
            if(hm.containsKey (ch))
            {
             //result="YES";
             return "YES".toString ();
            }

        }

        return "NO".toString ();

    }


    public static void main(String[] args) {
        String s1="hello";
        String s2="world";
            String result=twoStrings (s1,s2);
        System.out.println (result);

    }
}
