public class Solution {
    public static int squares(int a, int b) {
        // Write your code here
        double c=Math.sqrt (a);
        int d=(int)(Math.ceil (c));

        double e=Math.sqrt (b);
        int f=(int)(Math.floor (e));
        int count =0;

        for(int i=d;i<=f;i++)
        {
            int sqr=i*i;

            if((sqr>=a)&&(sqr<=b))
                count ++;
        }
        return count;


    }

    public static void main(String[] args) {
        //int a = 48;


        System.out.println (squares(17,24));
    }
}
