public class Recursion1 {
   static int sum=0;
    public static String  test(String str)
    {
        //int sum=0;
       // if(i>=sb.length ())
            //return "";
       // StringBuilder
      // reverse=reverse+sb.substring (i,i+1);
        //return
       //  test ( sb, i+1,reverse);
      // return reverse+reverse;
        //sum=sum+n;
       // return sum;
        //System.out.println (sum);
        if (str.isEmpty())
            return str;
        //If string consists of multiple character
        //Call the Function Recursively
        return test(str.substring(1)) + str.charAt(0);


    }

    public static void main(String[] args) {
      // int sum= test(5);
        String sb=new String  ("Biplob");
       // int len=sb.length ();
        int i=0;
       // System.out.println (sb,len);
        String  reverse=new String ();
        String result=test (sb);
        System.out.println (result);
    }
}
