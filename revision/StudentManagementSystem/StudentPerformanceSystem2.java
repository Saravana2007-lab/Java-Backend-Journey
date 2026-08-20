package revision.StudentManagementSystem;

import java.util.Scanner;

public class StudentPerformanceSystem2 {
    static class Student {
        String name;
        int rollNumber;
        double[] marks = new double[3];
        double average;
        String grade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();

            System.out.println("\nStudent " + (i + 1));
            System.out.print("Name: ");
            students[i].name = sc.next();

            System.out.print("Roll number: ");
            students[i].rollNumber = sc.nextInt();

            double total = 0;
            System.out.println("Enter marks for 3 subjects:");
            for (int j = 0; j < 3; j++) {
                students[i].marks[j] = sc.nextDouble();
                total += students[i].marks[j];
            }

            students[i].average = total / 3.0;
            students[i].grade = getGrade(students[i].average);
        }

        System.out.println("\n--- Student Details ---");
        for (Student student : students) {
            System.out.printf("%s | Roll No: %d | Average: %.2f | Grade: %s%n",
                    student.name, student.rollNumber, student.average, student.grade);
        }

        Student topper = students[0];
        for (Student student : students) {
            if (student.average > topper.average) {
                topper = student;
            }
        }

        System.out.printf("\nTopper: %s with an average of %.2f%n",
                topper.name, topper.average);

        sc.close();
    }

    static String getGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 40) {
            return "D";
        } else {
            return "Fail";
        }
    }
}
