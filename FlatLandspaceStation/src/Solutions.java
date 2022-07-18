public class Solutions {
    static int  flatlandSpaceStations(int n, int[] c) {
        int max = Integer.MIN_VALUE;
        int[] dist=new int[n];
        int[] firsttime=new int[n];
        int minimum=0;

        for (int j=0;j<c.length;j++) {
            for (int i = 0; i < n; i++) {

                firsttime[i]=Math.abs (c[j]-i);
                if(j==0)
                    dist[i]=Math.abs (c[j]-i);
                if(j>0) {
                    dist[i] = Integer.min (dist[i], firsttime[i]);
                }


            }
        }
        for(int j:dist)
        {
            if(j>max)
                max=j;
        }
        return max;
            //System.out.println (j);
    }

    public static void main(String[] args) {
        int n=6;
        int[] c=new int[]{0,1,2,3,4,5};
        int result=
                flatlandSpaceStations (n,c);
        System.out.println (result);
    }
}
