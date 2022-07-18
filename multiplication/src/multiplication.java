import java.util.Arrays;

public class multiplication {
    public static void main(String args[])
    {
        //int n=2;
        int arr[]={4,1,2,4,6,6,6};

        Arrays.sort (arr);
        //int j=1;
        int count=0;
        for(int i=0;i<=arr.length-1;i++) {
            if(arr[arr.length-1]==arr[i])
                count++;
        }
        System.out.println(count);
//        int a=1, b=1, c=1;
//
//        System.out.println("a="+a+""+b+""+c);

    }
}
