package Projects.SmartBank.service;
import Projects.SmartBank.model.*;
import java.util.Map;
import java.math.BigDecimal;
import java.util.HashMap;
 
public class BankService {
   private Map<String, Customer> customers = new HashMap<>();
   private Map<String, Account> accounts = new HashMap<>();


public boolean createCustomer(Customer customer) {
    String customerId = customer.getCustomerId(); 

    if (customers.containsKey(customerId)) {
        return false;
    }
    customers.put(customerId, customer);
    return true;
}

public Customer getCustomer(String customerId) {
        if (customers.containsKey(customerId)) {
            return customers.get(customerId); 
        }
        return null; 
    }

public boolean createAccount(Account account){
     String accountNumber = account.getAccountNumber();
     String customerId = account.getCustomerId();
     if (!customers.containsKey(customerId)) {
        return false;
    }
    if (accounts.containsKey(accountNumber)) {
        return false;
    }
    accounts.put(accountNumber, account);
     return true;
     
}
public Account getAccount(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            return accounts.get(accountNumber); 
        }
        return null; 
    }
public Account deposit(String accountNumber, BigDecimal amount){
          if (accounts.containsKey(accountNumber)) {
            accounts.getBalance(accountNumber)
        }
        return null; 
}
}
