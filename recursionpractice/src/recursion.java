public class recursion {
    static int reverse(  int i, int  n,int a[],int max,int slast)
    {
        //if (i==0)
          //  return 1;
//        if (array_begin = NULL)
//            return secondLargest
//        if (array_begin.value > largest)
//            secondLargest = largest
//        largest = array_begin.value
//        return find_largest(array_begin+1, largest, secondLargest)
            if(i==n ) return slast;
                 if(a[i]>max) {
                     slast = max;
                     max = a[i];
                 }

        return reverse (i+1,n,  a,  max,slast);
      //return ;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        int i=3,n=5;
        int max=Integer.MIN_VALUE;
        int slast=0;
        int[] a= new int[]{7,4,9,6,2};
       int result= reverse (1,n-1,a,max,slast);
       System.out.println(result);
          }
}
