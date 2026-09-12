package Projects.SmartBank;
import java.math.BigDecimal;
import Projects.SmartBank.model.*;
import Projects.SmartBank.service.*;

public class Main {
public static void main(String[] args){
    BankService bankService = new BankService();
    Customer customer = new Customer(
    "C001",
    "Saravana",
    "saravana@gmail.com",
    "9876543210"
);
Account account = new Account(
    "A1001",
    "C001",
    "SAVINGS",
    new BigDecimal("1000.00")
);
boolean customerCreated = bankService.createCustomer(customer);
boolean accountCreated =bankService.createAccount(account);
System.out.println(bankService.getCustomer("C001"));
System.out.println("\n");
System.out.println(bankService.getAccount("A1001"));
System.out.println("Customer created: " + customerCreated);
System.out.println("Account created: " + accountCreated);
    }
}
