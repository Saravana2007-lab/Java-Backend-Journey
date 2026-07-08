package Projects.CourseRegistrationSystem.model;

public class Student {
    private String name;
    private String id;
    private String departement;

    public Student(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.departement = department;
    }

    public String getName() {
        return name;
    }

    public void displayStudent() {
        System.out.println("Studentid:    " + id);
        System.out.println("Name:   " + name);
        System.out.println("deparement:    " + departement);
    }
}
