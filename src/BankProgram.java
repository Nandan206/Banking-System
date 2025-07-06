import java.util.*;
public class BankProgram {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("---------------");
            System.out.println("Welcome to Bank");
            System.out.println("---------------");
            System.out.println("1.Show Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("---------------");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Enter valid choice");
            }
        }
        System.out.println("-------------------------");
        System.out.println("Thank you for using Bank!");
        System.out.println("-------------------------");
        sc.close();
    }
    static void showBalance(double balance){
        System.out.println("----------------");
        System.out.printf("₹%.2f\n", balance);
    }
    static double deposit(){
        double amount;
        System.out.println("----------------------------");
        System.out.print("Enter amount to be deposited: ");
        amount = sc.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter amount to withdraw: ");
        amount = sc.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient balance");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}