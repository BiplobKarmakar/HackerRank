import java.util.Scanner;

//class isprime {
//public static void Checkprime(int a)
//        {
//            int n=Math.sqrt (a);
//            for(int i=0;i<=n;i++)
//
//           }
//        }

public class Solution {
     static boolean  Checkprime(int a)
     {
         int n=(int)Math.sqrt ( a);
         int i;
         boolean b=false;
          for( i=2;i<=n;i++)
         {
             if(a % i==0)
             {
                 //return false;
                 b=true;
                 break;
             }
             else
                 b=false;

         }
         return b;
     }
    public static void main(String[] args) {
       // isprime iprime=new isprime ();
        Scanner scanner= new Scanner (System.in);
        int t=scanner.nextInt ();
        while(t>0)
        {
            int a=scanner.nextInt ();
            if(Checkprime(a))
                System.out.println ("Not Prime");
            else
                System.out.println ("Prime");
            t--;
        }


    }
}
