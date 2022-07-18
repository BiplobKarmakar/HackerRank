public class Solution {
    public static void main(String[] args) {
      String  str="We promptly judged antique ivory buckles for the next prize";
      String strs=str.replaceAll ("[^a-zA-z]","");
       // System.out.println (strs);
      String str1=strs.toLowerCase ();
    int checkbox[]=new int[26];
      for(int i=0;i<str1.length();i++)
    {
        char ch=str1.charAt (i);
       if(checkbox[ch-'a']==0 )
           checkbox[ch-'a']=1;
    }
        for(int j=0;j< checkbox.length;j++) {

            if (checkbox[j] == 0)
                // return "not pangram";
            System.out.print ("Not");
        }
        System.out.println ("Yes");

       // return "pangram";

    }
}
