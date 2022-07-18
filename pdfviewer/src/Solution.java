import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import static java.lang.Math.*;

public class Solution {

    // Complete the designerPdfViewer function below.
    static void  DP(int[] h, String word)
    {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int i=0;
        int max=0;
        int length=word.length();

        for(char ch='a';ch<='z';ch++)
        {
            map.put(ch,h[i]);
            i++;
        }
        for(int j=0;j<length;j++)
        {
            int val=map.get(word.charAt(j));
            if(val>max)
                max=val;
        }
        System.out.println(max*length);


    }
    static int designerPdfViewer(int[] h, String word) {

        char[] words=word.toCharArray ();
        int wordlength=word.length ();

        char[] alphabet=new char[26];
        int[] position=new int[26];
        int i=0;
        for(char c='a';c<='z';c++)
        {
           alphabet[i++]=c;

        }
        int k=0; int max=Integer.MIN_VALUE;
        int[] value=new int[26];
        for(k=0;k<words.length;k++) {
            for (int j = 0; j < 26; j++) {
                if (words[k] == alphabet[j]) {
                    value[k] = h[j];
                  if (value[k] > max)
                        max = value[k];

                }

            }
        }
                return max*wordlength;
    }

   // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       // int[] h = {1, 3, 1, 3 ,1 ,4 ,1, 3, 2, 5, 5, 5, 5, 5, 5 ,5, 5, 5, 5, 5, 5, 5 ,5 ,5, 5, 5};
        int[] h={1 ,1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5 ,5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,5, 7};


        //  String[] hItems = scanner.nextLine().split(" ");
      //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

     //   for (int i = 0; i < 26; i++) {
      //      int hItem = Integer.parseInt(hItems[i]);
      //      h[i] = hItem;
      //  }

        //String word = scanner.nextLine();
        String word="zaba";

       // int result = designerPdfViewer(h, word);
     //  System.out.println (result);
        DP(h,word);

       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

       // bufferedWriter.close();

       // scanner.close();
    }
}
