public class Graph {

    int[][]adjmatrix;//=new graph[node][node];

    public Graph(int node )
    {
        this.adjmatrix=new int[node][node];
    }
void addnode(int u, int v)
{
    adjmatrix[u][v]=1;
    adjmatrix[v][u]=1;


}


    public static void main(String[] args) {
       // Graph gh=new Graph(4);
        undirected gh=new undirected(4);
        gh.addnode(0,1);
        gh.addnode(0,3);
        gh.addnode(1,2);
        gh.addnode(2,3);
        System.out.println (gh);

       /* for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
                System.out.print (gh.adjmatrix[i][j]+" ");
            System.out.println ();
        }*/






    }
}
