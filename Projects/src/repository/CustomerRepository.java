package Projects.src.repository;

import java.util.ArrayList;
import Projects.src.model.Account;

public class CustomerRepository {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void save(Account account) {
        accounts.add(account);
    }

    public boolean containsAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Account> getAllAccounts() {
        return accounts;
    }
}
