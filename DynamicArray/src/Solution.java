import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> seq=new ArrayList<> ();
    List<List<Integer>> seqList=new ArrayList<List<Integer>> ();
    int lastAns=0;


    Solution(int n)
    {
       for (int i=0;i<n;i++)
       {
           seq=new ArrayList<> ();
           seqList.add (seq);
       }

    }
    void appendValue(int x, int y, int N) {
        int rowIndex = (x ^ lastAns) % N;
        List<Integer> seq = seqList.get(rowIndex);
        seq.add(y);
    }

    private void printValue(int x, int y, int N) {
        int colIndex = 0;
        int rowIndex = (x ^ lastAns) % N;
        List<Integer> seq = seqList.get(rowIndex);
        colIndex = (y % seq.size());
        lastAns = seq.get(colIndex);
        System.out.println(lastAns);
    }

    public static void main(String[] args) {

        int n=2;
        int Q=5;
        int q=0,x=0,y=0;
        int a[][] =new int[][]{{1, 0, 5},
                               {1, 1, 7},
                               {1, 0, 3},
                               {2, 1, 0},
                               {2, 1, 1}};


            Solution s =new Solution(n);
         for(int i=0;i<5;i++) {
             q = a[i][0];
             x = a[i][1];
             y = a[i][2];


             if (q == 1) {
                 s.appendValue (x, y, n);
             } else {
                 s.printValue (x, y, n);
             }
         }

    }
    }