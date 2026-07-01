class Person {
    String name;

    Person(String name) {
        this.name = name;
        System.out.println("name:   " + name);
    }
}

class Student extends Person {
    String course;

    Student(String name, String course) {
        super(name);
        this.course = course;
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        Student student = new Student("Saravana", "BCA");
        System.out.println("Student name: " + student.name);
        System.out.println("Course: " + student.course);
    }
}
