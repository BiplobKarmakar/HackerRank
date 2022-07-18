import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
          Map<String,Integer> hm = new HashMap<String,Integer> ();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            hm.put (name,phone );
        }

       while(in.hasNext()){
            String s = in.next();
            // Write code here
        if(hm.containsKey(s))
            System.out.println (s + "=" + hm.get (s));

           else
               System.out.println ("Not found");
       }
        in.close();
    }
}