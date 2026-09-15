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

public boolean deposit(String accountNumber, BigDecimal amount) {
     if(amount.compareTo(BigDecimal.ZERO) <= 0 ){
        System.out.println("The amount should be greater than 0");
        return false;
    }
    if (!accounts.containsKey(accountNumber)) {
        System.out.println("The account number was wrong");
        return false;
    }

    Account account = accounts.get(accountNumber);
    BigDecimal newBalance = account.getBalance().add(amount);
    account.setBalance(newBalance);
    System.out.println("The transaction was completed");
    return true;
}
public boolean withdraw(String accountNumber, BigDecimal amount) {
     if(amount.compareTo(BigDecimal.ZERO) <= 0 ){
        System.out.println("The amount should be greater than 0");
        return false;
    }

    if(!accounts.containsKey(accountNumber)){
        System.out.println("The account number was wrong");
        return false;
    }

    Account account = accounts.get(accountNumber);
    if (amount.compareTo(account.getBalance()) > 0) {
        return false;
    }

    BigDecimal newbalance = account.getBalance().subtract(amount);
    account.setBalance(newbalance);
    System.out.println("The transaction was completed");
    return true;
}
public void printAllAccounts() {
    for (Account acc : accounts.values()) {
        System.out.println(acc);
    }
}



}
