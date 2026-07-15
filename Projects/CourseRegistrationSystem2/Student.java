package Projects.CourseRegistrationSystem2;
import Projects.CourseRegistrationSystem2.CourseManager;
public class Student {
private String studentId;
private String name;
private int age;
private String department;
Student(String studentId,String name,int age,String department){
this.studentId =studentId;
this.name = name;
this.age = age;
this.department = department;
}
 String getid(){
return studentId;
}
String  Stringto(){
    return "-----------------"+
        "Student name:  "+ studentId+
        "Name: " + name +
        "Age:   "+ age +
        "deapartemnt:   " + department;
}
}
