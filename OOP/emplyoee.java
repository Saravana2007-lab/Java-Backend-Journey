

class emplyoeee{
String employeeName;
int employeeId;
double salary;

static String company = "Google";

static int totalEmployees = 0;
emplyoeee(String employeeName,int employeeId,double salary){
    this.employeeName =employeeName;
    this.employeeId = employeeId;
    this.salary = salary;
    totalEmployees++;
}
void displayDetails(){
    System.out.println("Employee Name :" +employeeName+"\n" +"Employee ID :"+employeeId +"\n"  +"Salary :" +salary +"\n" + "Company :"+company );
}
static void changeCompany(String newCompany){
    company = newCompany;
}
static void displayTotalEmployees(){
    System.out.println("Total employee is :  "+ totalEmployees);
}
}
class emplyoee{
    public static void main(String[] args) {
    
    emplyoeee em1 = new emplyoeee("Gopal", 1, 20500.35);
    emplyoeee em2 = new emplyoeee("Suresh", 2, 38730);
    emplyoeee.changeCompany("Microsoft");
     em1.displayDetails();
     em2.displayDetails();
    
    emplyoeee.displayTotalEmployees();
    }
}