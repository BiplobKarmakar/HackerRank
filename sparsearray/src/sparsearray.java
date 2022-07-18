import java.util.ArrayList;
import java.util.List;

class sparsearray {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here

        List<Integer> a = new ArrayList<> ();
        Integer count = 0;

        for (String q : queries) {
            for (String st : strings) {
                if (q.equals (st))
                    count++;
            }
            a.add (count);
            count = 0;
            //return strings;
        }
        return a;
    }

    public static void main(String[] args) {
        List<String> str=new ArrayList<String> ();
        str.add ("ab");
        str.add ("ab");
        str.add ("abc");//{,"ab","abc"});
        List<String> queries= new ArrayList<>();
        queries.add("ab");
        queries.add("abc");
        queries.add("bc");

        List<Integer> returnednumber=
                matchingStrings(str,queries);
        System.out.println (returnednumber);

    }
}
