package Projects.ExpenseTracker.model;

import java.sql.Date;

public class Expense {
    private long expenseId;
    private double amount;
    private String category;
    private String description;
    private Date expenseDate;


    public Expense(long expenseId, double amount, String category, String description, Date expenseDate) {
        this.expenseId = expenseId;
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.expenseDate = expenseDate;
    }

    public long getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(long expenseId) {
        this.expenseId = expenseId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    @Override
    public String toString() {
        return "expense{" +
                "expenseId='" + expenseId + '\'' +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", expenseDate=" + expenseDate +
                '}';
    }
}
