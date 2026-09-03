package Collections.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Student Marks =====");
            System.out.println("1. Add Mark");
            System.out.println("2. Display Marks");
            System.out.println("3. Highest Mark");
            System.out.println("4. Lowest Mark");
            System.out.println("5. Average Mark");
            System.out.println("6. Search Mark");
            System.out.println("7. Remove Mark");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter mark: ");
                    int mark = scanner.nextInt();

                    if (mark >= 0 && mark <= 100) {
                        marks.add(mark);
                        System.out.println("Mark added successfully.");
                    } else {
                        System.out.println("Invalid mark. Enter between 0 and 100.");
                    }
                    break;

                case 2:
                    System.out.println("Marks: " + marks);
                    break;

                case 3:
                    if (marks.isEmpty()) {
                        System.out.println("No marks available.");
                    } else {
                        int highest = marks.get(0);

                        for (int m : marks) {
                            if (m > highest) {
                                highest = m;
                            }
                        }

                        System.out.println("Highest Mark: " + highest);
                    }
                    break;

                case 4:
                    if (marks.isEmpty()) {
                        System.out.println("No marks available.");
                    } else {
                        int lowest = marks.get(0);

                        for (int m : marks) {
                            if (m < lowest) {
                                lowest = m;
                            }
                        }

                        System.out.println("Lowest Mark: " + lowest);
                    }
                    break;

                case 5:
                    if (marks.isEmpty()) {
                        System.out.println("No marks available.");
                    } else {
                        int sum = 0;

                        for (int m : marks) {
                            sum += m;
                        }

                        double average = (double) sum / marks.size();

                        System.out.println("Average Mark: " + average);
                    }
                    break;

                case 6:
                    System.out.print("Enter mark to search: ");
                    int searchMark = scanner.nextInt();

                    if (marks.contains(searchMark)) {
                        System.out.println("Mark found.");
                    } else {
                        System.out.println("Mark not found.");
                    }
                    break;

                case 7:
                    System.out.print("Enter mark to remove: ");
                    int removeMark = scanner.nextInt();

                    if (marks.remove(Integer.valueOf(removeMark))) {
                        System.out.println("Mark removed successfully.");
                    } else {
                        System.out.println("Mark not found.");
                    }
                    break;

                case 8:
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 8);

        scanner.close();
    }
}
