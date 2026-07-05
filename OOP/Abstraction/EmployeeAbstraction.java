package Abstraction;
abstract class employee{
    String name;
    int empID;
    employee(String name,int empID){
        this.name = name;
        this.empID = empID;
    }
   void display(){
        System.out.println("Name:   "+name);
        System.out.println("empID:   "+empID);
    }
    abstract double calculatesalary();
}
class FullTimeEmployee extends employee{
double monthlySalary = 13000;
    FullTimeEmployee(String name,int empID){
        super(name, empID);
    }
@Override
double calculatesalary() {
    return monthlySalary;
}
@Override
void display(){
super.display();
System.out.println("the salary is   "+ calculatesalary());
}
}
class PartTimeEmployee extends employee{
int hoursWorked;
double hourlyRate = 13.5;
    PartTimeEmployee(String name,int empID,int hoursWorked){
        super(name, empID);
        this.hoursWorked =hoursWorked;
        
    }
@Override
double calculatesalary() {
    return hourlyRate*hoursWorked; 
}
@Override
void display(){
super.display();
System.out.println("the salary is   "+ calculatesalary());
}
}
public class EmployeeAbstraction {
    public static void main(String[] args) {
        employee[] em ={
            new PartTimeEmployee("Saravana",101,5),
            new FullTimeEmployee("boovan", 130)
        };
        for(employee e : em){
            e.display();
        }
    }
    
}
