class Person{
    String name;
int age;
void displayPerson(){
    System.out.println("Name:   "+ name);
    System.out.println("Age:   "+ age);
}
}
class Student extends Person{
    String course;
    void displayStudent(){
        System.out.println("Course:   "+ course);
    }
}

public class PersonStudentInheritance {
    public static void main(String[] args) {
        Student s = new Student();

s.name = "Saravana";
s.age = 19;
s.course = "BCA";

s.displayPerson();
s.displayStudent();
    }
}
