package Collections.Set;
import java.util.TreeSet;

class Student implements Comparable<Student> {
   private String name;
   private double[] marks;
   private int id;
    static TreeSet<Student> rank = new TreeSet<>();

    Student(String name, double[] marks,int id) {
        this.name = name;
        this.marks = marks;
        this.id = id;
        rank.add(this); 
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

  @Override
public int compareTo(Student s) {
    int avgCompare = Double.compare(s.getAverage(), this.getAverage());
        if (avgCompare == 0) {
        return Integer.compare(this.id, s.id);
    }
    return avgCompare;
}


    void print() {
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (double m : marks) {
            System.out.print(m + " ");
        }
        System.out.println("\nAverage: " + getAverage());
        System.out.println("id: " + id);

        System.out.println("-------------------");
    }
}

public class StudentRankingSystem {
    public static void main(String[] args) {
        new Student("Saravana", new double[]{85, 90, 92},101);
        new Student("Bob", new double[]{78, 88, 80},1213);
        new Student("Shob", new double[]{88, 80, 78},678);

        System.out.println("Ranking of Students:");
        for (Student s : Student.rank) {
            s.print();
        }
    }
}
