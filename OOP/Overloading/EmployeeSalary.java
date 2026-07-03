package Overloading;

class Employee {
    String name;
    double baseSalary = 5000.00;

    Employee(String name) {
        this.name = name;
    }

    double calculateSalary() {
        return baseSalary;
    }
}

class FullTime extends Employee {
    double salary = 18000.00;

    FullTime(String name) {
        super(name);
    }

    @Override
    double calculateSalary() {
        return salary;
    }
}

class PartTime extends Employee {
    double salary = 1000.00;

    PartTime(String name) {
        super(name);
    }

    @Override
    double calculateSalary() {
        return salary;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        FullTime f = new FullTime("Alice");
        PartTime p = new PartTime("Bob");
        Employee e = new Employee("Charlie");

        System.out.println(f.name + " salary: " + f.calculateSalary());
        System.out.println(p.name + " salary: " + p.calculateSalary());
        System.out.println(e.name + " salary: " + e.calculateSalary());
    }
}
