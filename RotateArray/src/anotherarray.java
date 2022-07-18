 class anotherarray {
    static int[] Rotation(int nums[], int k){
        int result[]=new int[nums.length];
        int p=k%nums.length;
        int a[]=new int[nums.length];
        for (int j=0,m=p;j<nums.length-p;j++)
            a[m++]=nums[j];
            for(int i=nums.length-p,l=0;i<nums.length;i++)
            a[l++]=nums[i];

        System.out.println (p);

return a;
     }
}
