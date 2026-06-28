package OOP;

class Student {

    String name;
    int age;
    double cgpa;

    Student() {
        name = "Unknown";
        age = 0;
        cgpa = 0.0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.cgpa = 0.0;
    }

    Student(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
    }

}

public class TypesofConstructor {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice", 20);
        Student s3 = new Student("Bob", 22, 3.7);

        System.out.println("Default constructor:");
        s1.display();

        System.out.println("\nParameterized constructor (name, age):");
        s2.display();

        System.out.println("\nParameterized constructor (name, age, cgpa):");
        s3.display();
    }
}
