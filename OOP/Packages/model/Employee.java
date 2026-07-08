package Packages.model;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double salary;

    public Employee(String employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID :   " + employeeId
                + "     Name :     " + name
                + "       Department :     " + department + "     Salary :   " + salary);
    }

    public void increaseSalary(double amount) {
        salary += amount;
        System.out.println("the update salary is " + salary);
    }
}
