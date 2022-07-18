
import java.util.*;

public class compare
{


    static void comparebobalice(List<Integer> a, List<Integer> b)
    {

       int i,al=0,bo=0;
       //int result[]=new int[3];
        List<Integer> result=new ArrayList<>();
     for(i=0;i<=2; i++)
     {
         if (a.get (i) > b.get (i)) al++;
         if (a.get (i) < b.get (i)) bo++;
     }
        //if (a.get (i)= b.get (i)) result.add (0);
        result.add(al);
        result.add(bo);
        System.out.println(result.toString ());
    }

    public static void main(String args[])
    {

        List<Integer> alice = new ArrayList<Integer> ();


        Collections.addAll(alice,17,28,30);
        List<Integer> bob = new ArrayList<Integer> ();
        Collections.addAll(bob,99,16,8);
        //int[] bob={3,6,10};

        compare.comparebobalice(alice,bob);
    }
}
