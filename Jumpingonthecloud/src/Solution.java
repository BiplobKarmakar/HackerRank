public class Solution {
    static int jumpingOnClouds(int[] c, int k) {
        int e=100;
        int n=c.length;
        int i=0;

       // while(i<n)
        do
        {
            e--;
          i=(i+k)%n;

            if(c[i]==1)
                e=e-2;
           // i=i+k;

        }while(i!=0);

         return e;

    }

    public static void main(String[] args) {
        int k=3;
        //int result= jumpingOnClouds (new int[]{0, 0, 1, 0, 0, 1, 1, 0},k);

       // 1 1 1 0 1 1 0 0 0 0
        int result= jumpingOnClouds (new int[]{1,1,1,0,1,1,0,0,0,0},k);

        // int result= jumpingOnClouds (new int[]{0,0,1,0},k);


        System.out.println (result);


    }
}
