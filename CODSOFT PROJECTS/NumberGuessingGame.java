import  java.util.*;

class NumberGuessingGame {
public static void main(String args[]){
    //create a numberGuessing Game help of java

    System.out.println("Weclome To The Number Guessing Game :\n");

     Scanner sc = new Scanner(System.in);
     int attempts  = 0 ;

          int userinput =0 ;
          int maxAttempts = 5;




    Random rannum = new Random();   // take a random value 

     int computerinput = rannum.nextInt(100);  // convert into interger and limit set on 100

     System.out.println(computerinput); 
   

     while(userinput != computerinput){       // jabtak userinput not equal na ho jaaye jab tak while loop chalta rhega 
      System.out.println("choose your Gussing Number");
        userinput = sc.nextInt();  // input form user 
       attempts++; 

             if (attempts >= maxAttempts) {  // only given limited chance on user 
    System.out.println("Oops You've used all your Attempts. The correct number was: " + computerinput);
    break ;}
     
       if( computerinput < userinput){  // help of user take input
        System.out.println("your Guessing Number is Too high .choose Low Number : ");
         
       }

      

       else if ( computerinput  >  userinput) {
        System.out.println("your Guessing Number is Too Low .choose High Number : ");
       }
       else{
     
        System.out.println(  "Crongluation " +"your Guessing Number is Correct  : ");
        

        System.out.println("Your Total Attempt is " + attempts);  // show total attempt from user 

    
}

       } 
     } 
    }

