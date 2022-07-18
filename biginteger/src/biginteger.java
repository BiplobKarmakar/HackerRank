public class biginteger {

static void averybigsum(long b[])
{
    long sum=0;
    int i;
    for(i=0;i<=b.length-1;i++)
    {
        sum=sum+b[i];
    }
    System.out.println (sum );
}
    public static void main(String args[])
    {

        long a[]={1000000001,1000000002,1000000003,1000000004,1000000005};
        biginteger.averybigsum (a);
    }
}
