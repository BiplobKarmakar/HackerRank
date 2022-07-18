import java.util.List;

public class Solution {
    public static int workbook(int n, int k, List<Integer> arr) {
        // Write your code here
        int page=0;
        int result=0;
        for(int p:arr)
        {
            page++;

            for(int i=1;i<=p;i++)
            {
                if(i==page)
                    result++;
                if((i%k==0)&&(i!=p))
                    page++;
            }

        }
        return result;

    }


    public static void main(String[] args) {

        int n=5;
        int k=3;

        List<Integer> arr=List.of (4, 2, 6, 1, 10);
        int result=workbook (n,k, arr);
        System.out.println (result);


    }
}
