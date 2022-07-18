import java.util.*;

public class Solution {

    public static Set addinset(String str)
    {
        Set<Character> set = new HashSet<Character> ();
        for(int i=0;i<str.length ();i++)
            set.add (str.charAt (i));

        return set;
    }

    public static int gemstones(List<String> arr)
    {
        // Write your code here


        Set<Character> set =new HashSet<Character> ();
        String firststring=arr.get(0);
        for(char ch:firststring.toCharArray ())
            set.add(ch);

           for (String str:  arr) {
               set.retainAll (addinset (str));
             //  System.out.println (set);

           }

        return set.size ();
    }
    public static void main(String[] args) {
        List<String> arr = new ArrayList<> (List.of ("abcdde", "baccd", "eeabg","abcd"));
       // int a=
        int n= gemstones (arr);
        System.out.println (n);



    }
}
