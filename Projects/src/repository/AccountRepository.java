package Projects.src.repository;

import java.util.ArrayList;
import Projects.src.model.Account;

public class AccountRepository {
    private final ArrayList<Account> accounts = new ArrayList<>();

    public void save(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        accounts.add(account);
    }

    public boolean containsAccount(String accountNumber) {
        if (accountNumber == null || accountNumber.isBlank()) {
            return false;
        }

        for (Account account : accounts) {
            if (account.getAccountNumber() != null && account.getAccountNumber().equals(accountNumber)) {
                return true;
            }
        }
        return false;
    }

    public Account findByAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.isBlank()) {
            return null;
        }

        for (Account account : accounts) {
            if (account.getAccountNumber() != null && account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public ArrayList<Account> findAll() {
        return accounts;
    }
}
