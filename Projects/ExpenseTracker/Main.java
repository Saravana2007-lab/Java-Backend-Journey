package Projects.ExpenseTracker;

import Projects.ExpenseTracker.dao.ExpenseDAO;
import Projects.ExpenseTracker.model.Expense;

public class Main {
    public static void main(String[] args) {
        ExpenseDAO expenseDAO = new ExpenseDAO();

        for (Expense expense : expenseDAO.getAllExpenses()) {
            System.out.println(expense);
        }
    }
}
