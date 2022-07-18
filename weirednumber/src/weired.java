public class weired {
    public static void main(String args[])
    {
        int n=24;
        if(n%2==1)
            System.out.println ("Weird");
        else if (n>= 2 && n<=5)
            System.out.println ("Not Weird");
        else if  (n>=6 && n<=20)
        System.out.println ("Weird");

        else if (n%2==0 && n>20)
            System.out.println ("Not Weird");


    }
}

//
//    If  is odd, print Weird
//        If  is even and in the inclusive range of 2 to 5 , print Not Weird
//        If  is even and in the inclusive range of 6 to 20, print Weird
//        If  is even and greater than 20, print Not Weird
