import java.util.*;

public class Solution {
    public static void main(String[] args) {
      //  HashMap<String, Integer>  numbers =new HashMap<String, Integer>();
        HashMap<Integer, String>  numbers =new HashMap<Integer, String>();
       // scores.put("Liton", 10);
       // scores.put ("sujon",12);
       // scores.put("hasan",13);
        Scanner scanner = new Scanner (System.in) ;
        int num1= scanner.nextInt () ;

      //  int number1= Integer.parseInt (num1);
         int num2 =scanner.nextInt ();
       //  int number2=Integer.parseInt (num2);
         int result = num1+num2;
        numbers.put(1,"One");
        numbers.put(2,"Two");
        numbers.put(3,"Three");
        numbers.put(4,"four");
        numbers.put(5,"Five");
        numbers.put(6,"Six");
        numbers.put(7,"Seven");
        numbers.put(8,"Eight");
        numbers.put(9,"Nine");
        numbers.put(10,"Ten");
       //  if (numbers.containsKey (result))

        System.out.println (numbers.get(result));

    }
}
