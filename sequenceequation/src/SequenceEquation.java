import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceEquation {
    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        List<Integer> b=new ArrayList<Integer> ();
        int s=p.size ();
        int i=1;
        while (i<=s)
        {
          int ind=p.indexOf (i)+1;
          int ind1=p.indexOf (ind)+1;
          b.add(ind1);

            i++;

        }
        return b;

    }

//3   2 3 1
    //2 3 1

    public static void main(String[] args) {


       List<Integer> a=new ArrayList<Integer>(Arrays.asList (5,2,1,3,4));
       List<Integer> b=permutationEquation (a);
        System.out.println (b);

    }
}
