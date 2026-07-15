package Projects.CourseRegistrationSystem2;
import Projects.CourseRegistrationSystem2.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseManager cm = new CourseManager();
        do{
            System.out.println("-------Menu--------");
            System.out.println("Do you want to add 1.New Student, 2.New Course, 3.Display all the Students, 4.Display all the Cousres, 5.Exit");
            int a = sc.nextInt();
            switch(a){
                case 1:    System.out.println("enter the name");
                            
                cm.addStudent("hello");break;
            }
        }while(true);
    }
}
