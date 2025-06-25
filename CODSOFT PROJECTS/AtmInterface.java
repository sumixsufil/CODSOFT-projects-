import java.util.*;

public class AtmInterface {
    static int balance = 10000;
    public static void main(String[] args ){
        int pin = 000;
        Scanner sc = new Scanner(System.in);

        System.out.println("*******   Welcome To ATM Interface   **********");
        System.out.print("Enter Your Pin: ");
        int PinVerification = sc.nextInt();

        if(pin == PinVerification){
            System.out.println("Pin Verified");

            while(true){
                System.out.println("\nChoose an option:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch(choice){
                    case 1:
                        CheckBalance();
                        break;
                    case 2:
                        balance = deposit(balance);
                        break;
                    case 3:
                        balance = withdraw(balance);
                        break;
                    case 4:
                        System.out.println("Thank you for using our ATM.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        } else {
            System.out.println("Pin Not Verified. Please Try Again.");
        }
    }

    public static int deposit(int amount){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount you want to deposit: ");
        int deposit = sc.nextInt();
        System.out.println("your Old Balance is :" + " $"+ amount);
        int updateBalance = deposit + amount;
        System.out.println("Your new balance is: "+ " $" + updateBalance);
        return updateBalance;
    }

    public static int withdraw(int amount){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount you want to withdraw: "+ " $");
        int withdraw = sc.nextInt();

        if(withdraw > amount){
            System.out.println("Insufficient Balance");
            return amount;
        } else {
            int updateBalance = amount - withdraw;
            System.out.println("Your Old balance is: " + " $"+ amount);
            System.out.println("Please collect your cash."+ " $"+withdraw );
            System.out.println("Your new balance is: " + " $"+ updateBalance);
            return updateBalance;
        }
    }

    public static void CheckBalance(){
        System.out.println("Your current balance is: " + " $"+ balance);
    }
}
