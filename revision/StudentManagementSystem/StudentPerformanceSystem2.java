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
void calavg(Student[n]){
if(Student in )
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

    // ✅ Separate function to calculate average and grade
    static void calculatePerformance(Student student) {
        double total = 0;
        for (double mark : student.marks) {
            total += mark;
        }
        student.average = total / student.marks.length;
        student.grade = getGrade(student.average);
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

            System.out.println("Enter marks for 3 subjects:");
            for (int j = 0; j < 3; j++) {
                students[i].marks[j] = sc.nextDouble();
            }

            calculatePerformance(students[i]);
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
        if (average >= 90) return "A";
        else if (average >= 75) return "B";
        else if (average >= 60) return "C";
        else if (average >= 40) return "D";
        else return "Fail";
    }
}
