package Collections.Set;

import java.util.Arrays;
import java.util.Comparator;

class Student{
    private String id;
    private String name;
    private double[] marks;

    Student(String id, String name, double[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
        double getAverage() {
           if (marks.length == 0) {
            return 0; 
        }
        double sum = 0;
        for (double m : marks) {
            sum += m;
        }
        return sum / marks.length;
    }
    String getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double[] getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', marks=" + java.util.Arrays.toString(marks) + '}';
    }
    

}

class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int avgCompare = Double.compare(s2.getAverage(), s1.getAverage());
        if (avgCompare == 0) {
            return s1.getId().compareTo(s2.getId());
        }
        return avgCompare;
    }

}
class NameComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        int nameCompare = s1.getName().compareTo(s2.getName());
        if (nameCompare == 0) {
            return s1.getId().compareTo(s2.getId());
        }
        return nameCompare;
    }
}
class IdComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getId().compareTo(s2.getId());
    }
}

public class StudentComparatorDemo {
     public static void main(String[] args) {

        Student s1 = new Student(
                "S103",
                "Rahul",
                new double[]{80, 90, 70}
        );

        Student s2 = new Student(
                "S101",
                "Amit",
                new double[]{95, 85, 90}
        );

        Student s3 = new Student(
                "S102",
                "Priya",
                new double[]{75, 80, 85}
        );

        Student s4 = new Student(
                "S104",
                "Amit",
                new double[]{90, 90, 90}
        );

        Student[] students = {s1, s2, s3, s4};

        System.out.println("Original order:");
        for (Student s : students) {
            System.out.println(s);
        }

        Arrays.sort(students, new MarksComparator());

        System.out.println("\nSorted by Average Marks:");
        for (Student s : students) {
            System.out.println(s);
        }

        Arrays.sort(students, new NameComparator());

        System.out.println("\nSorted by Name:");
        for (Student s : students) {
            System.out.println(s);
        }

        Arrays.sort(students, new IdComparator());

        System.out.println("\nSorted by ID:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
