import java.util.Scanner;

public class StudentGradeCalculater {

    public static void main(String[] args) {

     System.out.println("Welcome To The StudentGradeCalculater ");
    System.out.println("Enter your all GRade marks");
    System.out.println("----------------------------------------");
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter your Math Grade  ");
    int math = sc.nextInt();
    System.out.print("Enter your Science  Grade  ");
    int science = sc.nextInt();
    System.out.print("Enter your English  Grade  ");
    int english = sc.nextInt();
    System.out.print("Enter your History  Grade  ");
    int history = sc.nextInt();
    System.out.print("Enter your Hindi  Grade  ");
    int hindi  = sc.nextInt();
    System.out.print("Enter your Computer Sciecne   Grade  ");
    int  ComputerSciecne  =sc.nextInt();
    int total = math + science + english + history + hindi + ComputerSciecne ;
    int percentage = total / 6 ;
    int PerSubjectMarks  = 100 ;
    int TotalMarks = PerSubjectMarks ;
    int compartment = 33;
    System.out.println("----------------------------------------");


    System.out.println("Your Total Marks Is Out Of 600 /"+total);
    System.out.println("Your  Marks percentage  Is : "+percentage + "%");

   // Grade system using if-else  
    System.out.println("----------------------------------------");
        if (percentage >= 90) {
            System.out.println("Your Grade is: A+");
        } else if (percentage >= 80) {
            System.out.println("Your Grade is: A");
        } else if (percentage >= 70) {
            System.out.println("Your Grade is: B+");
        } else if (percentage >= 60) {
            System.out.println("Your Grade is: B");
        } else if (percentage >= 50) {
            System.out.println("Your Grade is: C+");
        } else if (percentage >= 40) {
            System.out.println("Your Grade is: C");
        } else if (percentage >= 33) {
            System.out.println("Your Grade is: D");
        } 
         
         // Compartment System Using If-else
          System.out.println("----------------------------------------");

          int failcount  = 0 ;
    
        if(math < compartment){
            System.out.println("Your Compartment Subject is Math ");
            failcount++;
        }
    
        if(science < compartment){
            System.out.println("Your Compartment Subject is Science  ");
            failcount++;
        }
    
        if(hindi < compartment){
            System.out.println("Your Compartment Subject is Hindi ");
            failcount++;
        }
    
        if(english < compartment){
            System.out.println("Your Compartment Subject is English ");
            failcount++;
        }
    
        if(history < compartment){
            System.out.println("Your Compartment Subject is History ");
            failcount++;
        }
    
        if(ComputerSciecne < compartment){
            System.out.println("Your Compartment Subject is : Computer Science  ");
            failcount++;
        }

        // Tell Compatment Details.
        System.out.println("----------------------------------------");

        if(failcount == 0){
            System.out.println("Cronglautions You Are Passed ");
        }
             else if  ( failcount == 1 ){
                System.out.println("Your Have Compartment in 1. Subject ");
             }
             else if ( failcount < 2 ){
                System.out.println(" You are Failed in " + failcount + " subjects.");
            
             }

            
           else {
            System.out.println(" You Failed in " + failcount + " subjects. Re-appear required.");
        }

        
    }

        
    
   

 
 
  }
