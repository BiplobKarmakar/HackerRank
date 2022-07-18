import sun.awt.geom.AreaOp;

import javax.xml.soap.SOAPPart;

public class Sumofarray {



static void Sumarray(int b[])
{
    int i,sum=0;
    for(i=0;i<b.length;i++)

    {
      sum=sum+b[i];
    }
    System.out.println ( sum );

}


    public static void main(String[] args) {

        int a[]={1,2, 3, 4, 10 ,11};

        Sumofarray.Sumarray (a);




    }

}
