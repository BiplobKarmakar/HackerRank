public class Solution {
    public static void main(String[] args) {
       // int[] a= new int[]{10,5,20,20,4,5,2,25,1} ;
        int[] a=new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42};

        int n=a.length;

        int mn=a[0];//Integer.MAX_VALUE;

        int[] min=new int[10];
        int hvalue=a[0];
        int lvalue=a[0];
        int maxcount=0;
        int mincount=0;
        int i;
        for(i=0;i<n-1;i++) {

            if (a[i + 1] > hvalue) {
                hvalue = a[i + 1];
                //lvalue=a[i+1];
                maxcount++;
            }
            if (a[i + 1] < lvalue) {

                lvalue = a[i + 1];
                mincount++;

            }
        }

  System.out.println (maxcount +" "+mincount );

    }
}
