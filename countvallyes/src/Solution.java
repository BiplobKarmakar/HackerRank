import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
       // int n= s.length ();
   char[] ch = new char[10000];
   int bit=0;
   int slop=0;
   int level=0;
   int down=0;
   ch=s.toCharArray ();
  // int =strlen();
       // if (ch[0]=='U')
int i=0;
        while(i<n) {
             if(bit==0 && ch[i]=='U') {
                 level++;
                 i++;
             }
           else if (ch[i] == 'D' && level!=0 ) {
                level--;
                i++;
            }
                 //else
           else if (ch[i] == 'D' && level==0) {
                bit = bit - 1;
                i++;
            }
          else  if(ch[i]=='U'&& level==0) {
                bit = bit + 1;
                i++;
            }
            if(bit==0 && level==0)
                slop++;
        }

       return slop;
    }

   // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    //    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = 12;//scanner.nextInt();
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       // 12
       String s= "DDUUDDUDUUUD";

       // String s = "12\n" +
              //  "DDUUDDUDUUUD\nUDDDUDUU";//scanner.nextLine();

        int result = countingValleys(n, s);
        System.out.println (result);
        Collections.sort

        //bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

       // bufferedWriter.close();

       // scanner.close();
    }
}
