package Collections.Set;
class Student{
    private String id;
    private String name;
    private double marks;

    Student(String id, String name, double marks) {
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

    double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', marks=" + marks + '}';
    }
    

}

class MarksComparator{
      @Override
public int compareTo(Student s) {
    int avgCompare = Double.compare(s.getAverage(), this.getAverage());
        if (avgCompare == 0) {
        return Integer.compare(this.id, s.id);
    }
    return avgCompare;
}

}
class NameComparator{

}
class IdComparator{

}

public class StudentComparatorDemo {
    
}
