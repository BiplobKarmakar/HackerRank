public class Solution {

    public static String gameOfThrones(String s) {
        // Write your code here

        int []charatp=new int[26];

        for(int i=0;i<s.length ();i++)
            charatp[s.charAt (i)-'a']++;

        boolean noofoddchar=false;
        for(int i=0;i<26;i++) {
            if (charatp[i]%2!=0)
                if(noofoddchar)
                    return "NO";
                else
                    noofoddchar=true;
        }
        return "YES";

    }

    public static void main(String[] args) {

        String result= gameOfThrones ("abcddcba");
        System.out.println (result);

    }
}
