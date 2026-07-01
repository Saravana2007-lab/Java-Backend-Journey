class Person {
    String name;
    int stdId;

    Person(String name, int stdId) {
        this.name = name;
        this.stdId = stdId;

        System.out.println("Name: " + name);
        System.out.println("Student ID: " + stdId);
    }
}

class Student extends Person {
    int dep;

    Student(String name, int stdId, int dep) {
        super(name, stdId);  
        this.dep = dep;

        System.out.println("Class: " + dep);
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 101, 12);
    
    }
}