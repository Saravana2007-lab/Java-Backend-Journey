package Projects.src.service;
import Projects.src.model.Account;
import java.util.Random;
import java.util.Scanner;
import Projects.src.repository.CustomerRepository;
import java.util.Scanner;
public class AccountService {
    CustomerRepository c = new CustomerRepository();
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    String PREFIX = "Sar";
    String accountnumber(){
         StringBuilder sb = new StringBuilder(PREFIX);
               for (int i = 0; i < 12; i++) {
            int digit = rand.nextInt(10); 
            sb.append(digit);
        }
        return sb.toString();
    }
    void newaccount(){
        System.out.println("Enter your name ");
        String a = sc.nextLine();
        String accnum;
       do{
        accnum = accountnumber();
       }while(c.containsAccount(accnum));
        Account acc = new Account(a, a, 0, null, a, a);

    }
}
