import java.util.*;

public class ArrayListLinkedListBeginner {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");

        LinkedList<String> subjects = new LinkedList<>();
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("English");

        System.out.println("ArrayList: " + students);
        System.out.println("LinkedList: " + subjects);

        students.remove("Bob");
        subjects.addFirst("Computer");
        subjects.addLast("History");

        System.out.println("Updated ArrayList: " + students);
        System.out.println("Updated LinkedList: " + subjects);

        System.out.println("First student: " + students.get(0));
        System.out.println("First subject: " + subjects.getFirst());
        System.out.println("Last subject: " + subjects.getLast());
    }
}
