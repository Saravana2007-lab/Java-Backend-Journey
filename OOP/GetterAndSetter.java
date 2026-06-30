
import java.util.Scanner;

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        setName(name);
        setAge(age);
    }

    void setName(String name) {
          if(name.equals("")){
            System.out.println("enter the name again");
            return;
        }
        this.name = name;
      
    }

    String getName() {
        return name;
    }

    void setAge(int age) {
        if(age<0){
            System.out.println("invalid age");
            return;
        }
        this.age = age;
        
    }

    int getAge() {
        return age;
    }
}

public class GetterAndSetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        Student student = new Student(name, age);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        
    }
}

