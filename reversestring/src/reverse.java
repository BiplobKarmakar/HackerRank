public class reverse {


    public static void main(String[] args) {
        int[] a=new int[]{2, 3, 4, 1};

        int n=a.length-1;

        for(int i=n;i>=0;i--)
            System.out.print(a[i]+" ");
    }
}
