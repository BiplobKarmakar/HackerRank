import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;
      Student(String fsname,String flname, int sid, int sscores[])
      {
          super(fsname,flname,sid);
          //int[100] scores;
          this.testScores=sscores;
      }
    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    char calculate()
    {
        int n=testScores.length;
        char grade='\0';
        int totalscores=0;
        for(int i=0;i<n;i++)
        {
            totalscores=totalscores+testScores[i];
        }
        int avg = totalscores/n;
        if(avg>=90 && avg<=100)
            grade='O';
        if(avg>=80 && avg<90)
            grade='E';
        if(avg>=70 && avg<80)
            grade='A';
        if(avg>=55 && avg<70)
            grade='P';
        if(avg>=40 && avg<55)
            grade='D';
        if( avg<40)
            grade='T';

   return grade;
    }
}

class Solution {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String firstName = scan.next();
//        String lastName = scan.next();
//        int id = scan.nextInt();
//        int numScores = scan.nextInt();
//        int[] testScores = new int[numScores];
//        for(int i = 0; i < numScores; i++){
//            testScores[i] = scan.nextInt();
//        }
//        scan.close();

        String firstName="Biplob";
        String lastName="Karmakar";
        int id =9842;
        int[] testScores=new int[]{20,15};
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}