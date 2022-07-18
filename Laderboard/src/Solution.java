import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.TreeSet;

import static java.util.stream.IntStream.of;

//import static jdk.nashorn.internal.objects.NativeString.indexOf;

public class Solution {




    // Complete the climbingLeaderboard function below.
//    private static int indexOf(TreeSet<Integer> set, Integer element){
//
//
//        List<Integer> list = new ArrayList<Integer>(set);
//
//
//        return list.indexOf(element);
//    }
    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        int[] result =new int[alice.length];
        int j=0;
        int[] array = of(scores).distinct().toArray();
        int i = array.length-1;
        for(int score: alice) {
            while(i>=0) {
                if(score>=array[i])
                    i--;
                else
                {
                    //System.out.println(i+2);
                    result[j++]=i+2;
                    break;
                }
            }
            if(i<0) result[j++]=1;
        }
 return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    //    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    //    int scoresCount = scanner.nextInt();
     //   scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

       // int[] scores = new int[scoresCount];
        int[] scores={100, 100, 50, 40, 40, 20, 10};
               //{100,90, 90, 80, 75, 60};
              //  100, 100, 50, 40, 40, 20, 10 };//10,90,90,80,75,60};

       // String[] scoresItems = scanner.nextLine().split(" ");
      //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      //  for (int i = 0; i < scoresCount; i++) {
       //     int scoresItem = Integer.parseInt(scoresItems[i]);
       //     scores[i] = scoresItem;
       // }

       // int aliceCount = scanner.nextInt();
      //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice ={5, 25, 50, 120}; //{50, 65, 77, 90, 102};
                //5, 25, 50, 120};//50,65,77,90,102};//new int[aliceCount];

      //  String[] aliceItems = scanner.nextLine().split(" ");
      //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      //  for (int i = 0; i < aliceCount; i++) {
        //    int aliceItem = Integer.parseInt(aliceItems[i]);
       //     alice[i] = aliceItem;
//
        int[] result =climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++)
           // bufferedWriter.write(String.valueOf(result[i]));
            System.out.println (result[i]);
//
//            if (i != result.length - 1) {
//              //  bufferedWriter.write("\n");
//                System.out.println();
//            }
//        }

       // bufferedWriter.newLine();

      //  bufferedWriter.close();

        scanner.close();
    }
}
