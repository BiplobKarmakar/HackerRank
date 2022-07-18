import java.math.BigInteger;
import java.math.BigInteger.*;

public class Solution {

    public static void main(String[] args) {
        int n=25;

        BigInteger result=BigInteger.ONE;

        for(int i=2;i<=n;i++)
            result=result.multiply (BigInteger.valueOf (i));
        System.out.println (result);
    }
}
