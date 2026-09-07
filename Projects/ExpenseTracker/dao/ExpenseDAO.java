
package Projects.ExpenseTracker.dao;

import Projects.ExpenseTracker.model.Expense;
import Projects.ExpenseTracker.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExpenseDAO {

    public List<Expense> getAllExpenses() {

        List<Expense> expenses = new ArrayList<>();

        String sql = "SELECT expense_id, amount, category, description, expense_date FROM EXPENSES";

        try (
             Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Expense expense = new Expense(
                        resultSet.getLong("expense_id"),
                        resultSet.getDouble("amount"),
                        resultSet.getString("category"),
                        resultSet.getString("description"),
                        resultSet.getDate("expense_date")
                );

                expenses.add(expense);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return expenses;
    }
}

