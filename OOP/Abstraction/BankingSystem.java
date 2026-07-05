    package Abstraction;
    abstract class Account{
        String accountNumber; 
        double balance;
        Account(String accountNumber,double balance){
            this.accountNumber =accountNumber;
            this.balance = balance;
        }
    void deposit(double amount){
    balance+=amount;
    System.out.println("Deposit Successful.");
    }
    void displayBalance(){
        System.out.println("Account Number:  "+ accountNumber);
        System.out.println("Balance:    "+ balance);
        System.out.println("========================");
    }
    abstract void withdraw(double amount);
    }
    class SavingsAccount extends Account{
        SavingsAccount(String accountNumber,double balance){
            super(accountNumber, balance);
        
        }
        @Override
        void withdraw(double amount) {
            if(amount < 0){
                System.out.println("Enter an amount more than 0");
                return;
            }
            else if(amount > balance){
                System.out.println("insufficient funds.");
                return;
            }
            balance-=amount;
            System.out.println("withdraw complete");
        }
    }
    class CurrentAccount extends Account{
        CurrentAccount(String accountNumber,double balance){
            super(accountNumber, balance);
            
        }
        @Override
        void withdraw(double amount) {
            double nbalance = balance - amount;
            if(amount < 0){
                System.out.println("Enter an amount more than 0");
                return;
            }
            else if(-5000 > nbalance){
                System.out.println("Overdraft Limit Exceeded.");
                return;
            }
            balance-=amount;
            System.out.println("withdraw complete");
        }
    }
    public class BankingSystem {
        public static void main(String[] args) {
        Account[] accounts ={
            new CurrentAccount("S101",6000),
            new SavingsAccount("B102",2000)
        };
        for(Account ac :accounts ){
    ac.deposit(1000);
    ac.withdraw(3000);
    ac.displayBalance();
        }
        }
    }
