class Person {
    String name;
    int stdId;

    Person(String name, int stdId) {
        this.name = name;
        this.stdId = stdId;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + stdId);
    }
}

class Student extends Person {
    int dep;

    Student(String name, int stdId, int dep) {
        super(name, stdId);
        this.dep = dep;
    }

    void display() {
        super.display();
        System.out.println("Class: " + dep);
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Student s = new Student("Rahul", 101, 12);
        s.display();
    }
}