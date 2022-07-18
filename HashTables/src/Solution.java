import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static void checkMagazine
            (List<String> magazine, List<String> note) {
        // Write your code here

        HashMap<String,Integer> hm= new HashMap<> ();


        for(String word:magazine)
        {
            if(hm.containsKey (word))
            {
                int count=hm.get (word);
                count++;
                hm.put (word,count);
            }
            else
            {
                int count=1;
                hm.put (word,count);
            }
        }
        //HashMap<String,Integer> hm= new HashMap<> ();
        for(String nwords:note)
        {
            if(hm.containsKey (nwords))
            {
                int count=hm.get (nwords);
                if(count>=1) {
                    count--;
                    hm.put (nwords, count);
                }
                else if(count<=0)
                 {
                     System.out.println ("No");
                     return;
                 }
            }
//            else
//            {
//                System.out.println ("No");
//                return;
//            }
        }


        System.out.println ("Yes");
    }


    public static void main(String[] args) {

//        List<String> magazine= new ArrayList<>();
//                //("give me one grand today night");
//        magazine.add("give");
//        magazine.add("me");
//        magazine.add("one");
//        magazine.add("grand");
//        magazine.add("today");
//        magazine.add ("night");
        //List<String> magazine= List.of ("give", "me", "one", "grand", "today", "night");

       // List<String> note=List.of ("give", "one", "grand", "today");
        //two times three is not four
        //two times two is four
        List<String> magazine=List.of ("two", "times", "three", "is", "not", "four");
        List<String> note=List.of("two", "times", "two", "is", "four");
        checkMagazine (magazine,note);
        //System.out.println (magazine);
       // System.out.println (note);
    }
}
