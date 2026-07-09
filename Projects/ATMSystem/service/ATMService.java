package Projects.ATMSystem.service;

import Projects.ATMSystem.model.Account;

public class ATMService {
    private String problem;
    private Account account;

    public ATMService(String problem, Account account){
        this.problem = problem;
        this.account = account;
        System.out.println("We will contact you soon about the problem: " 
            + problem + ". Thank you for contacting us, " 
            + account.getHolderName());
    }

    public void performWithdrawal(Account account, double amount) {
        try {
            account.withdraw(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        } finally {
            System.out.println("Transaction Finished.");
        }
    }
}
