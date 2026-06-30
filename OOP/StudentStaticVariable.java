

class Student {
    String name;
    int reg;
    static String clg = "RNSIT";

    Student(String name, int reg) {
        this.name = name;
        this.reg = reg;
    }

    void display() {
        System.out.println("User name: " + name + "   reg no: " + reg + "   college: " + clg);
    }
}

public class StudentStaticVariable {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);
        Student.clg ="RNSIT";

        s1.display();
        s2.display();
    }
}
