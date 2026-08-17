package revision.StudentManagementSystem;

import java.util.Scanner;

public class EmployeeManagementSystem2 {
    static class Employee {
        String name;
        int id;
        double[] salaries = new double[3]; // last 3 months
        double average;
        String performance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of employees: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            employees[i] = new Employee();

            System.out.println("\nEmployee " + (i + 1));
            System.out.print("Name: ");
            employees[i].name = sc.next();

            System.out.print("ID: ");
            employees[i].id = sc.nextInt();

            double total = 0;
            System.out.println("Enter salaries for last 3 months:");
            for (int j = 0; j < 3; j++) {
                employees[i].salaries[j] = sc.nextDouble();
                total += employees[i].salaries[j];
            }

            employees[i].average = total / 3.0;
            employees[i].performance = (employees[i].average >= 30000) ? "Good" : "Needs Improvement";
        }

        System.out.println("\n--- Employee Details ---");
        for (Employee e : employees) {
            System.out.println(e.name + " | ID: " + e.id + " | Avg Salary: " + e.average + " | " + e.performance);
        }

        Employee best = employees[0];
        for (Employee e : employees) {
            if (e.average > best.average) {
                best = e;
            }
        }
        System.out.println("\nBest Performer: " + best.name + " with Avg Salary " + best.average);

        sc.close();
    }
}
