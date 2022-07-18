import java.util.Collections;
import java.util.Scanner;

public class HashCode {

    public static void main(String[] args) {
        try (Scanner in = new Scanner (System.in)) {
            int T = in.nextInt ();
            String result = new String();

            for (int t = 1; t <= T; ++t) {
                int N = in.nextInt ();
                String Nclients = in.nextLine ();
                int M = in.nextInt ();
                String Mcliens = in.nextLine ();

                if (N > M)
                    result = result + Nclients;

            }

            //System.out.print (  Collections.sort(result,String.CASE_INSENSITIVE_ORDER));

        }

    }
}
