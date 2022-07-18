import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        int newarray[][]=new int[n][n];
        int anotherarray[][]=new int[n][n];

        for(int i=0;i<queries.size ();i++)
        {
            int one=queries.get (i).get (0);
            int two=queries.get (i).get (1);
            int three=queries.get (i).get (2);
             newarray[i][one-1]=three;
             if(two<n)
                 newarray[i][two]=three*(-1);


            }
        int prev=0;
        for(int i=0;i<newarray[i].length-1;i++)
        {
            for(int j=0;j<newarray[i].length;j++)
            {
                anotherarray[i][j]=newarray[i][j]+prev;
                prev=anotherarray[i][j];
            }
            System.out.println ();
        }
        int sum[]=new int[n];
        for(int i=0;i<anotherarray[i].length-1;i++)
        {
         int firstrow=anotherarray[0][i];
            int seceondrow=anotherarray[1][i];
            int thirdrow=anotherarray[2][i];
            sum[i]=firstrow+seceondrow+thirdrow;
        }
        long max=Integer.MIN_VALUE;
        for(int s:sum) {
            System.out.print ("the number is "+s);

            if (s > max)
                max = s;
        }
        System.out.println ("the max is "+max);

        System.out.println ("Inside another array");

        for(int i=0;i<queries.size ();i++)
        {
            for(int j=0;j<newarray[i].length;j++)
            {
                System.out.print (anotherarray[i][j]+" ");
                //anotherarray[i][j]=newarray[i][j]+anotherarray[i][j];
            }
            System.out.println ();
            long largestnumber=Integer.MIN_VALUE;
            for(int k=0;k<anotherarray[2].length;k++)
            {
                if (anotherarray[2][k]>largestnumber)
                    largestnumber=anotherarray[2][k];
            }
            System.out.println ("The largest number is "+largestnumber);
        }

        return 1;

    }
    public static void main(String[] args) {
        int n=5;
        List<List<Integer>> queries = new ArrayList<> ();
        queries.add(Arrays.asList(1, 2,100));
        queries.add (Arrays.asList (2,5,100));
        queries.add (Arrays.asList (3,4,100));

       // 5 3
       // 1 2 100
       // 2 5 100
        //3 4 100

       // queries={{},{},{}};

        long max=arrayManipulation (n, queries);


    }

}
