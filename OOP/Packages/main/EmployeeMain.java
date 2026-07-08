package Packages.main;

import Packages.model.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employee ={ 
        new Employee("E101", "Ayesha", "IT", 55000.0),
        new Employee("E121", "Saravana", "king", 1111111111.1)
        };
        for(Employee e: employee){
        e.displayEmployee();
         e.increaseSalary(10000);
        }

    }
}
