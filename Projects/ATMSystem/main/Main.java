package Projects.ATMSystem.main;

import Projects.ATMSystem.service.ATMService;
import Projects.ATMSystem.model.Account;

public class Main {
    public static void main(String[] args) {
        Account[] ac = {
            new Account("C10808", "Saravana", 100000000),
            new Account("S4567", "Boovan", 567890)
        };

        
        ac[1].deposit(5678);

        ATMService atmService = new ATMService("ATM Withdrawal Issue", ac[1]);

        atmService.performWithdrawal(ac[1], 5000);

        atmService.performWithdrawal(ac[1], -100);

        atmService.performWithdrawal(ac[1], 999999999);
    }
}
