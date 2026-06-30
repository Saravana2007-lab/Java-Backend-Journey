import java.util.Scanner;

class Bank {
    private String accountHolder;
    private int balance;

    Bank(String accountHolder, int balance) {
        setAccountHolder(accountHolder);
        setBalance(balance);
    }

    void setAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.isBlank()) {
            System.out.println("Invalid account holder name.");
            return;
        }
        this.accountHolder = accountHolder;
    }

    String getAccountHolder() {
        return accountHolder;
    }

    void setBalance(int balance) {
        if (balance < 0) {
            System.out.println("Balance cannot be negative.");
            return;
        }
        this.balance = balance;
    }

    int getBalance() {
        return balance;
    }

    void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        System.out.println("Current balance: " + balance);
    }

    void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
        System.out.println("Current balance: " + balance);
    }
}

public class BankEnscapulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        Bank bank = new Bank(name, 0);

        System.out.print("Enter amount to deposit: ");
        int depositAmount = sc.nextInt();
        bank.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        int withdrawAmount = sc.nextInt();
        bank.withdraw(withdrawAmount);

        System.out.println("Account holder: " + bank.getAccountHolder());
        System.out.println("Final balance: " + bank.getBalance());

        sc.close();
    }
}

