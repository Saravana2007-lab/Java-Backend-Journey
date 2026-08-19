package revision.StudentManagementSystem;

import java.util.Scanner;

public class StudentManagementSystem {
    static class Student {
        String name;
        int age;
        int[] marks = new int[3];
        double average;
        String result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();

            System.out.println("\nStudent " + (i + 1));
            System.out.print("Name: ");
            students[i].name = sc.nextLine();

            System.out.print("Age: ");
            students[i].age = sc.nextInt();

            int total = 0;
            System.out.println("Enter 3 subject marks:");
            for (int j = 0; j < 3; j++) {
                int mark;
                do {
                    mark = sc.nextInt();
                    if (mark < 0 || mark > 100) {
                        System.out.print("Invalid mark. Enter a mark from 0 to 100: ");
                    }
                } while (mark < 0 || mark > 100);

                students[i].marks[j] = mark;
                total += students[i].marks[j];
            }

            students[i].average = total / 3.0;
            students[i].result = (students[i].average >= 40 && allPassed(students[i].marks)) ? "Pass" : "Fail";
        }

        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            System.out.println(s.name + " | Age: " + s.age + " | Avg: " + s.average + " | " + s.result);
        }

        if (students.length > 0) {
            Student topper = students[0];
            for (Student s : students) {
                if (s.average > topper.average) {
                    topper = s;
                }
            }
            System.out.println("\nTopper: " + topper.name + " with Avg " + topper.average);
        } else {
            System.out.println("\nNo students available.");
        }

        sc.nextLine();
        System.out.print("Enter student name to search: ");
        String searchName = sc.nextLine();
        boolean found = false;
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(searchName)) {
                System.out.println("Student found");
                System.out.println("Name: " + s.name);
                System.out.println("Age: " + s.age);
                System.out.printf("Average: %.2f%n", s.average);
                System.out.println("Result: " + s.result);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found");
        }

        sc.close();
    }

    static boolean allPassed(int[] marks) {
        for (int m : marks) {
            if (m < 35) return false;
        }
        return true;
    }
}
