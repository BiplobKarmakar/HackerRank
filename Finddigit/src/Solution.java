public class Solution {
    public static int findDigits(int n) {
        // Write your code here

        int count =0;
        int temp=n;

        while(n!=0)
        {
            int mod =n%10;
            if((mod!=0) && (temp%mod==0))
                count++;
            n=n/10;

        }
        return count;
    }

    public static void main(String[] args) {

        int n=1012;

        int result=findDigits (n);
        System.out.println (result);

    }
}
