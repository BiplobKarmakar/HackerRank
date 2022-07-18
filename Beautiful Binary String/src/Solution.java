public class Solution {
    public static int beautifulBinaryString(String b) {
        // Write your code here
        StringBuilder sb=new StringBuilder (b);
        int count=0;
        for(int i=1;i<sb.length ()-1;i++)
        {
            if(sb.charAt (i)=='1' &&
            sb.charAt (i-1)=='0' && sb.charAt (i+1)=='0')
            {
                count++;
                sb.setCharAt (i-1,'1');
                sb.setCharAt (i+1,'1');

            }

        }
      return count;
    }

    public static void main(String[] args) {
            String b="01100";

            int n= beautifulBinaryString (b);
        System.out.println (n);
    }
}
