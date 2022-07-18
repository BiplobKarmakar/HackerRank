public class RArray {
    public static int[] reverse(int input[])
    {
     //   System.out.println ("Inside reverse");
        int rev[]=new int[input.length];
        int j=0;
        for(int i=input.length-1;i>=0;i--)
        {
            rev[j++]=input[i];
        }
       // for(int r:rev)
        //    System.out.print (r+" ");
        return rev;
    }
    public static int[] RotateArray(int nums[],int k)
    {
        int result[]=new int[nums.length];
        int p=k%nums.length;
        result=reverse (nums);

         int leftarray[]=new int[p];
         int rightarray[]=new int[nums.length-p];
         for(int i=0;i<p;i++)
             leftarray[i]=result[i];
         int l=0;
         for(int j=p;j<nums.length;j++)
             rightarray[l++]=result[j];
         leftarray=reverse (leftarray);
         rightarray=reverse (rightarray);
         for(int q=0;q<leftarray.length;q++)
             nums[q]=leftarray[q];
         for(int m=0;m<rightarray.length;m++)
             nums[leftarray.length+m]=rightarray[m];


         return nums;
    }
    public static void main(String[] args) {
        //Input: nums = [-1,-100,3,99], k = 2

       // int a[]=new int[]{1, 2, 3, 4, 5, 6, 7};
        int a[]=new int[]{-1,-100,3,99};

        int k=2;

        //int result[] = RotateArray (a,k);
        int result[]=anotherarray.Rotation(a,k);
        System.out.println ("Inside main ");
        for(int r:result)
            System.out.print (r);

    }
}
