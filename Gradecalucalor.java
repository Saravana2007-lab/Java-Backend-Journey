// Gradecalucalor
// author - Saravana
import java.util.Scanner;

public class Gradecalucalor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");

        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Marks must be between 0 and 100.");
        } else {
            String grade;
            String status;

            if (marks >= 90) {
                grade = "A+";
                status = "PASS";
            } else if (marks >= 80) {
                grade = "A";
                status = "PASS";
            } else if (marks >= 70) {
                grade = "B";
                status = "PASS";
            } else if (marks >= 60) {
                grade = "C";
                status = "PASS";
            } else if (marks >= 50) {
                grade = "D";
                status = "PASS";
            } else if (marks >= 40) {
                grade = "E";
                status = "PASS";
            } else {
                grade = "F";
                status = "FAIL";
            }

            System.out.println("Result: " + status);
            System.out.println("Grade: " + grade);
        }

        sc.close();
    }
}
