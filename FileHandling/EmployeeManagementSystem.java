package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

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
void delete(){
    try{
        System.out.println("enter the id ");
        
        File file = new File("temp.txt");
        BufferedReader br =new BufferedReader( new FileReader("employee.txt"))
         BufferedWriter bw = new BufferedWriter(new FileWriter("temp.txt"));
         BufferedWriter b = new BufferedWriter(new FileWriter("employee.txt"));
String line;
while((line =)){}
    }
    catch(IOExceptionm e){

    }
}
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp = new Employee();
             emp.add();
                emp.View();
      
    }
}
