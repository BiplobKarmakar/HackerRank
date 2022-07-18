public class Solution {
    public static int anagram(String s) {
        // Write your code here
        int count=0;
        if(s.length ()%2!=0)
            return -1;

        StringBuilder str1=new StringBuilder(s.substring (0, s.length ()/2));
        StringBuilder str2=new StringBuilder (s.substring (s.length ()/2,s.length ()));
       // System.out.println (str1 +" "+ str2 );
         for(int i=0;i<str1.length ();i++)
         {
             char ch=str1.charAt (i);
             for(int j=0;j<str2.length ();j++)
             {
                 if(ch==str2.charAt (j))
                 {
                     str2.deleteCharAt (j);
                     break;
                 }
                // else
                    // count++;
             }
             //count++;
         }
        return str2.length ();

    }

    public static void main(String[] args) {

        String s="aaabbb";
        int n=anagram (s);
        System.out.println (n);

    }
}
