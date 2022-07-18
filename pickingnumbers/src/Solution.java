import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        //Object[] b=a.toArray ();
        int s = a.size ();
        int[] countingarray = new int[s];
        Integer[] itemsArray = new Integer[s];
        itemsArray = a.toArray (itemsArray);
        int count = 0;
        for (int i = 0; i < s ; i++) {
            count = 0;
            for (int j = 0; j < s; j++) {

                if (itemsArray[i] - itemsArray[j] == 0||itemsArray[i] - itemsArray[j] == 1)
                    count++;
            }
            countingarray[i] = count;

        }
        Arrays.sort (countingarray);

        return countingarray[countingarray.length - 1];

    }
}

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader (new InputStreamReader (System.in));
            // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            // int n = Integer.parseInt(bufferedReader.readLine().trim());

            // List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            //       .map(Integer::parseInt)
            //     .collect(toList());
            List<Integer> a = Arrays.asList (4, 6, 5, 3, 3, 1);
                    //1, 2, 2, 3, 1, 2);
            //4, 6 ,5 ,3 ,3 ,1);

            int result = Result.pickingNumbers (a);
            System.out.println (result);

            //  bufferedWriter.write(String.valueOf(result));
            //  bufferedWriter.newLine();

            bufferedReader.close ();
            //  bufferedWriter.close();
        }
    }

