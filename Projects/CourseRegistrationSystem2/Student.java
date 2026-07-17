package Projects.CourseRegistrationSystem2;

public class Student {
    private String studentId;
    private String name;
    private int age;
    private String department;

    Student(String studentId, String name, int age, String department) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    String getStudentid() {
        return studentId;
    }
    String getStudentname(){
        return name;
    }
    @Override
    public String toString() {
        return "-----------------\n" +
               "Student ID: " + studentId + "\n" +
               "Name: " + name + "\n" +
               "Age: " + age + "\n" +
               "Department: " + department;
    }
}
