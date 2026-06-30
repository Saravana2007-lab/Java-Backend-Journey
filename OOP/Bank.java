
import java.util.Scanner; 
class Branch{
    Scanner sc = new Scanner(System.in);
    String User;
    double balance =0.0;
    static double interestRate = 6.5;
    void deposit(){
        System.out.println("enter the amount of money you want to deposit");
        double a = sc.nextDouble();
        balance += a;
        System.out.println("Total balance is:    "+ balance);
    }
    void withdraw(){
        System.out.println("enter the amount of money you want to withdraw");
        double b = sc.nextDouble();
        if(b > balance){
            System.out.println("Not enough balance");
            return;
        }
        balance -= b;
        System.out.println("Total balance is:    "+ balance);
    }

    double calculateInterest() {
        return balance * interestRate / 100.0;
    }

    void display(){
        System.out.println("Current Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Amount: " + calculateInterest());
    }
}

public class Bank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Branch br = new Branch();

        System.out.println("Select option: 1.Deposit  2.Withdraw  3.CalculateInterest  4.Balance");
        String choice = sc.nextLine().toLowerCase();

        switch (choice) {
            case "1":
                br.deposit();
                break;
            case "2":
                br.withdraw();
                break;
            case "3":
                System.out.println("Interest Amount: " + br.calculateInterest());
                break;
            case "4":
                br.display();
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}
