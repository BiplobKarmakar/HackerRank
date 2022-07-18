import java.util.*;

public class Solutions {
    public static void stones(int n, int a, int b) {
        // Write your code here
        Set<Integer> hs=new TreeSet<> ();

        for(int i=0, j=n-1;i<n;i++,j--)
        {
            int ans=a*i+j*b;
            hs.add (ans);
        }
        System.out.println (hs);
     //   hs.sort ();
       // return hs;

    }

    public static void main(String[] args) {
      //  List<Integer> result=
                stones(2,2,3);
      //  System.out.println (result);

    }
}
