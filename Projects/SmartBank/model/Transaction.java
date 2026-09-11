package Projects.SmartBank.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private String accountNumber;
    private String transactionId;
    private String type;
    private BigDecimal amount;
    private LocalDateTime timestamp;

    public Transaction(String accountNumber, String transactionId, String type, BigDecimal amount, LocalDateTime timestamp) {
        this.accountNumber = accountNumber;
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + "\nAccount Number: " + accountNumber +
                "\nType: " + type + "\nAmount: " + amount + "\nTimestamp: " + timestamp;
    }
}
