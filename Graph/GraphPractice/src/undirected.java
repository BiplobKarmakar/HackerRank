import java.util.LinkedList;

class undirected {
    LinkedList<Integer>[] adj;
    int v;
    int e;
    public undirected(int nodes)
    {
        this.adj=new LinkedList[nodes];
        this.e=0;
        this.v=nodes;
        for(int i=0;i<nodes;i++)
            adj[i]=new LinkedList<> ();

    }
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append ("Vertices " + v + "Edges " + e+"\n");
        for (int i = 0; i < v; i++) {
            sb.append (i + ":");
            for (int w : adj[i]) {
                sb.append (w + " ");
            }
            sb.append ("\n");

        }
       return sb.toString ();
    }

    void addnode(int u, int v)
    {
       this.adj[u].add (v);
       this.adj[v].add (u);
       e++;
    }

}
