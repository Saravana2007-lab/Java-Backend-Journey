package Projects.ATMSystem.model;

public class Account {
private String accountNumber;
private String holderName;
private double balance;
public Account(String accountNumber, String holderName, double balance){
    this.accountNumber = accountNumber;
    this.holderName = holderName;
    this.balance = balance;
}
void displayAccount(){
    System.out.println("Account Number :    "+ accountNumber);
    System.out.println("Holder Name :   "+holderName);
    System.out.println("Balance :   "+balance);
}
public void deposit(double amount){
    if(amount <= 0){
        throw new IllegalArgumentException("Amount should be greater than 0");
    }
    balance+=amount;
    System.out.println("The new balance is:    "+ balance);
}
public void withdraw(double amount){
    if(amount <= 0){
        System.out.println("Amount should be greater than 0");
        return;
    }
    if(balance < amount){
        System.out.println("Insufficient funds.");
        return;
    }
    balance -= amount;
    System.out.println("The new balance is: " + balance);
}

    public String getHolderName() {
        return holderName;
    }
}
