package Projects.src.service;

import Projects.src.model.Account;
import java.util.Random;
import java.util.Scanner;
import Projects.src.repository.CustomerRepository;

public class AccountService {
    private CustomerRepository c = new CustomerRepository();
    private Random rand = new Random();
    private Scanner sc = new Scanner(System.in);
    private static final String PREFIX = "Sar";

    private String accountnumber() {
        StringBuilder sb = new StringBuilder(PREFIX);
        for (int i = 0; i < 12; i++) {
            int digit = rand.nextInt(10); 
            sb.append(digit);
        }
        return sb.toString();
    }

    public void newaccount() {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Ensure unique account number
        String accnum;
        do {
            accnum = accountnumber();
        } while (c.containsAccount(accnum));

        // Adjust constructor parameters based on your Account class definition
        Account acc = new Account(accnum, name, 0, null, null, null);

        // Save to repository
        c.save(acc);

        System.out.println("Account created successfully!");
        System.out.println("Account Number: " + accnum);
    }
}
