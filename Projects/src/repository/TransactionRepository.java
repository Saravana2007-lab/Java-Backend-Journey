package Projects.src.repository;

import java.util.ArrayList;
import Projects.src.model.Transaction;

public class TransactionRepository {
    private final ArrayList<Transaction> transactions = new ArrayList<>();

    public void save(Transaction transaction) {
        if (transaction == null) {
            throw new IllegalArgumentException("Transaction cannot be null");
        }
        transactions.add(transaction);
    }

    public Transaction findByTransactionId(String transactionId) {
        if (transactionId == null || transactionId.isBlank()) {
            return null;
        }

        for (Transaction transaction : transactions) {
            if (transaction.getTransactionId() != null && transaction.getTransactionId().equals(transactionId)) {
                return transaction;
            }
        }
        return null;
    }

    public ArrayList<Transaction> findByAccountNumber(String accountNumber) {
        ArrayList<Transaction> result = new ArrayList<>();

        if (accountNumber == null || accountNumber.isBlank()) {
            return result;
        }

        for (Transaction transaction : transactions) {
            if (transaction.getAccountNumber() != null && transaction.getAccountNumber().equals(accountNumber)) {
                result.add(transaction);
            }
        }
        return result;
    }

    public ArrayList<Transaction> findAll() {
        return transactions;
    }
}
