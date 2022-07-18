import java.util.ArrayList;
import java.util.List;

public class Solutions {
    public static List<String> cavityMap(List<String> grid) {
        // Write your code here

       List<String> result =new ArrayList<> ();
        char[][] ch=new char[grid.size ()][grid.size ()];
        for(int i=0;i<grid.size ();i++) {
            //int k=0;
            for (int j = 0; j < grid.get (0).length (); j++) {

                ch[i][j]=grid.get (i).charAt (j);
                // k++;
            }
        }

        for(int i=1;i<ch.length-1;i++) {
            for (int j = 1; j < ch[i].length-1; j++) {
                //System.out.print (ch[i][j]+" ");
                if(ch[i][j]>ch[i-1][j]&&ch[i][j]>ch[i][j-1]
                &&ch[i][j]>ch[i][j+1]&&ch[i][j]>ch[i+1][j])
                    ch[i][j]='X';
            }
           // System.out.println ();
        }
        for(int i=0;i<ch.length;i++) {
            StringBuffer sb=new StringBuffer ();
            for (int j = 0; j < ch[i].length; j++) {
                sb.append (ch[i][j]);
            }
            result.add (sb.toString ());
        }
        return result;

    }
    public static void main(String[] args) {

      List<String> grid=List.of("1112", "1912", "1892", "1234");

        System.out.println (grid);
       List<String> result=
                cavityMap (grid);
        System.out.println ("result"+result);
    }
}
