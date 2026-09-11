package Projects.SmartBank.model;

import java.math.BigDecimal;

public class Account {
    private String accountNumber;
    private String customerId;
    private String accountType;
    private BigDecimal balance;

    public Account(String accountNumber, String customerId, String accountType, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + "\nCustomer ID: " + customerId +
                "\nAccount Type: " + accountType + "\nBalance: " + balance;
    }
}
