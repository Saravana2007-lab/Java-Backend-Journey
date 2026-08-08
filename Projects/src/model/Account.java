package Projects.src.model;

public class Account {
    private String Name;
    private String accountNumber;
    private double balance;
    private Customer customer;
    private String accountType;
    private String status;

    public Account(String Name,String accountNumber, double balance, Customer customer, String accountType, String status) {
        this.Name = Name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
        this.accountType = accountType;
        this.status = status;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}