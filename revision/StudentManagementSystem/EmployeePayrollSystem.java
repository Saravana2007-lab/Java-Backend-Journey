package revision.StudentManagementSystem;

import java.sql.*;
import java.util.Scanner;

public class EmployeePayrollSystem {
    private Connection connection;
    private Scanner scanner;
    
    public EmployeePayrollSystem() {
        scanner = new Scanner(System.in);
        connectDatabase();
    }
    
    // Connect to database
    public void connectDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_db", "root", "password");
            createTable();
            System.out.println("Database connected!");
        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
    
    // Create employee table
    public void createTable() {
        try {
            String sql = "CREATE TABLE IF NOT EXISTS employees (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), salary DOUBLE, department VARCHAR(30))";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Table error: " + e.getMessage());
        }
    }
    
    // Add employee
    public void addEmployee() {
        try {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter salary: ");
            double salary = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter department: ");
            String department = scanner.nextLine();
            
            String sql = "INSERT INTO employees (name, salary, department) VALUES ('" + name + "', " + salary + ", '" + department + "')";
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Employee added!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // View all employees
    public void viewEmployees() {
        try {
            String sql = "SELECT * FROM employees";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            System.out.println("\nID\tName\t\tSalary\t\tDepartment");
            System.out.println("================================================");
            
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t\t" + rs.getDouble("salary") + "\t" + rs.getString("department"));
            }
            System.out.println();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Search employee by ID
    public void searchEmployee() {
        try {
            System.out.print("Enter employee ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            
            String sql = "SELECT * FROM employees WHERE id = " + id;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
                System.out.println("\nEmployee Found!");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Salary: " + rs.getDouble("salary"));
                System.out.println("Department: " + rs.getString("department"));
            } else {
                System.out.println("Employee not found!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Update salary
    public void updateSalary() {
        try {
            System.out.print("Enter employee ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter new salary: ");
            double salary = Double.parseDouble(scanner.nextLine());
            
            String sql = "UPDATE employees SET salary = " + salary + " WHERE id = " + id;
            Statement stmt = connection.createStatement();
            int rows = stmt.executeUpdate(sql);
            
            if (rows > 0) {
                System.out.println("Salary updated!");
            } else {
                System.out.println("Employee not found!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Delete employee
    public void deleteEmployee() {
        try {
            System.out.print("Enter employee ID to delete: ");
            int id = Integer.parseInt(scanner.nextLine());
            
            String sql = "DELETE FROM employees WHERE id = " + id;
            Statement stmt = connection.createStatement();
            int rows = stmt.executeUpdate(sql);
            
            if (rows > 0) {
                System.out.println("Employee deleted!");
            } else {
                System.out.println("Employee not found!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Menu
    public void menu() {
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\n--- Employee Payroll System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            
            int choice = Integer.parseInt(scanner.nextLine());
            
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                    updateSalary();
                    break;
                case 5:
                    deleteEmployee();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        closeConnection();
    }
    
    // Close connection
    public void closeConnection() {
        try {
            connection.close();
            System.out.println("Connection closed.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        EmployeePayrollSystem system = new EmployeePayrollSystem();
        system.menu();
    }
}
