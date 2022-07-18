import java.util.Arrays;
public class Solution {


    public static void main(String args[]) {
        int[ ][ ] a =  {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
         int h=0;
        int  sum[]= new int[16];
           int s=0;
        int i,j,k;
      for(i=0;i<4;i++)
          for(j=0;j<4;j++ )
          {
             sum[h++]=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
              //int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                      //arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];



          }
              //for(k=0;k<3;k++)
        int max = Arrays.stream(sum).max().getAsInt();
          System.out.println (max);


    }
}




