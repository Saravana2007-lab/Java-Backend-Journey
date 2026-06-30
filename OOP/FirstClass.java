      
class Student {
    String name;
    int age;
    double cgpa;
       void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(cgpa);
    }
}


public class FirstClass {
 
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Saravana";
        student1.age = 19;
        student1.cgpa= 8.7;

        student2.name = "Rahul";
        student2.age = 20;
        student2.cgpa= 8.7;
        student1.display();
        student2.display();
    }
}


    

