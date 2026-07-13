package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;



class Employee {
    Scanner sc = new Scanner(System.in);

    public void create() {
        try {
            File file = new File("employee.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    private String name; private String Department ;
    private String id;
    private double Salary;
void add(){
    try{
    BufferedReader br = new BufferedReader(new FileReader("employee.txt"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("employee.txt",true));
    System.out.println("enter the deatils properly");
    System.out.println("Enter the id");
         id = sc.nextLine();
    String line;
    
    while ((line = br.readLine()) != null) {
    String[] parts = line.split(",");
    if ( parts[0].equals(id)) {
        System.out.println("Id already taken");
        return;
    }
}
br.close();
    
    System.out.println("Enter name");
    name = sc.nextLine();
    System.out.println("enter departement");
    Department = sc.nextLine();
    System.out.println("Salary");
    Salary = sc.nextDouble();
    sc.nextLine();
    String record = id + ","+ name + ","+ Department +","+ Salary;
    bw.write(record);
    bw.newLine();
    bw.close();
    System.out.println("Employee added successfully!");
    
    }
    catch(IOException e){
        System.err.println("Error   "+ e.getMessage());
    } 
}
void View(){
    try{
        BufferedReader br = new BufferedReader(new FileReader("employee.txt"));
        String line;
        while((line = br.readLine())!= null){
             System.out.println("-------------------");
            System.out.println(line);
            System.out.println("-------------------");
        }
        
    }
    catch(IOException e){
        System.out.println("Error   "+ e.getMessage());
    }
}
void Search(){
    try{
    BufferedReader br = new BufferedReader(new FileReader("employee.txt"));
    System.out.println("Enter the ID");
    String ID = sc.nextLine();
    String line;
    while ((line = br.readLine()) != null){
        String[] data = line.split(",");
        if(data[0].equals(ID)){
            System.out.println(line);
        }
    }
}
catch(IOException e){
System.out.println("Error:  "+ e.getMessage());
}
}
void delete() {
    try {
        System.out.println("Enter the id to delete: ");
        String ID = sc.nextLine();

        File inputFile = new File("employee.txt");
        File tempFile = new File("temp.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length > 0 && data[0].equals(ID)) {
                    found = true; 
                    continue;
                }
                bw.write(line);
                bw.newLine();
            }

            if (found) {
                System.out.println("Record deleted successfully.");
            } else {
                System.out.println("No record found with ID: " + ID);
            }
        }

        
        if (inputFile.delete()) {
            tempFile.renameTo(inputFile);
        }

    } catch (IOException e) {
        System.err.println("Error: " + e.getMessage());
    }
}

}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Create File");
            System.out.println("2. Add Employee");
            System.out.println("3. View Employees");
            System.out.println("4. Search Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    emp.create();
                    break;
                case 2:
                    emp.add();
                    break;
                case 3:
                    emp.View();
                    break;
                case 4:
                    emp.Search();
                    break;
                case 5:
                    emp.delete();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
