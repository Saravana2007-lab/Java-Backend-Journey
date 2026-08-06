package Projects.src.service;
import Projects.src.model.Account;
import java.util.Random;
import java.util.Scanner;
import Projects.src.repository.CustomerRepository;
public class AccountService {
    CustomerRepository c = new CustomerRepository();
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    String PREFIX = "Sar";
    void accountnumber(){
         StringBuilder sb = new StringBuilder(PREFIX);
               for (int i = 0; i < 12; i++) {
            int digit = rand.nextInt(10); 
            sb.append(digit);
        }
        if(c.customersAccount().contains)
    }
    void newaccount(){
        
    }
}
