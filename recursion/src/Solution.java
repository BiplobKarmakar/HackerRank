
//static int factorial(int n)
//        {
//            int fact =1;
//           if(n==1)
//               return;
//           else
//                fact= fact* factorial(n-1);
//           return fact;
//
//        }

public class Solution {
    static int fact=1;
    static int factorial(int n)
    {
       // int fact =1;
        if(n==1)
            return fact;
        else
            fact= n* factorial(n-1);
        return fact;

    }

    public static void main(String[] args) {

        int i =factorial(6);

        System.out.println(i);
    }

}
