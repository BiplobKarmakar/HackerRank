import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int makingAnagrams(String s1, String s2)
    {
        // Write your code here
        StringBuilder str=new StringBuilder (s1);
        StringBuilder str2=new StringBuilder (s2);
        int length=0;
        StringBuilder maxbuilder=new StringBuilder ();
        StringBuilder minbuilder=new StringBuilder ();

        if(str.length ()>=str2.length ()) {
            length = str.length ();
            maxbuilder=str;
            minbuilder=str2;
        }else
        {
            length = str2.length ();
            maxbuilder=str2;
            minbuilder=str;

        }

        int count=0;
        for(int i=0;i<minbuilder.length ();i++)
        {
            char ch=minbuilder.charAt (i);
            for(int j=0;j<maxbuilder.length ();j++)
            {
               if (ch==maxbuilder.charAt (j))
                {
                    minbuilder.setCharAt (i,'#');
                    maxbuilder.setCharAt (j,'?');
                    count=count+2;
                    break;
                }
            }
        }
        int n=minbuilder.length ()+maxbuilder.length ()-count;
       return n;
    }

    public static void main(String[] args) {

      // String str1 = "cde";
        String str1= "absdjkvuahdakejfnfauhdsaavasdlkj";
       // String str2 = "abc";
        String str2="djfladfhiawasdkjvalskufhafablsdkashlahdfa";

        int n = makingAnagrams (str1, str2);
        System.out.println (n);
       // System.out.println (Collections.sort (str1));


    }

}
