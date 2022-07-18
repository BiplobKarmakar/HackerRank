
class Gen<T>
{
    T ob;
  //  U abs;
    Gen (T o)
    {
      ob=o;
     // abs=ab;
    }
    T getob()
    {
        return ob;
    }
//    U getAbs()
//    {
//        return  abs;
//    }
    void showtype()
    {
        System.out.println("Type of T is " + ob.getClass ().getName ());
       // System.out.println ("Type of T is " + abs.getClass ().getName ());
    }
}



public class Solutions {
    public static void main(String[] args) {
        Gen<Integer> iob;
        iob= new Gen<Integer>(88);
        iob.showtype ();
        int v= iob.getob ();
        System.out.println ("Value is "+ v);

       // String x= iob.getAbs ();

       // System.out.println ("vaoue of x = "+x);

     Gen<String> sob= new Gen<>("Biplob");
      sob.showtype ();;
      String str=sob.getob();

     System.out.println ("value of string  "+str );

    }

}
