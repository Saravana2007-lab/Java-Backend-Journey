package FileHandling;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
class Student{
     Scanner sc = new Scanner(System.in);
    void add(String name,String id,int age,String course,double marks){
        try{
        File file = new File("Student.txt");
        FileWriter writer = new FileWriter("Student.txt",true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("Name: " + name + ", Age: " + age + ", Course: " + course + ", Marks: " + marks + " ,  ID: " + id);
            bw.newLine();
            bw.close();
            System.out.println("Student added ");
        }
    catch(IOException e){
System.out.println("Error writing to file: " + e.getMessage());
    }
}
    void View(){
        try{
        FileReader reader = new FileReader("Student.txt");
        BufferedReader br = new BufferedReader(reader);
        String line;
          System.out.println("---- Student Records ----");
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
        }
        catch(IOException e){
            System.out.println("Error   "+ e.getMessage());
        }
    } 
 void Search(String id){
        try {
            BufferedReader br = new BufferedReader(new FileReader("Student.txt"));
            String line;
            boolean found = false;
            while ((line = br.readLine()) != null) {
                if (line.contains("ID: " + id)) {
                    System.out.println("Found: " + line);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No record found for ID: " + id);
            }
        }
  catch(IOException e){
            System.out.println("Error   "+ e.getMessage());
        }
    }
void Update(String id) {
    Scanner sc = new Scanner(System.in);
    try {
        File file = new File("Student.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line;
        boolean found = false;

        while ((line = br.readLine()) != null) {
            if (line.contains("ID: " + id)) {
                System.out.println("Found: " + line);
                found = true;

                // Split into parts
                String[] parts = line.split(",");

                System.out.println("Which field do you want to update? (name/age/course/marks)");
                String field = sc.nextLine().toLowerCase();

                for (int i = 0; i < parts.length; i++) {
                    if (parts[i].toLowerCase().contains("name") && field.equals("name")) {
                        System.out.print("Enter new Name: ");
                        String newName = sc.nextLine();
                        parts[i] = "Name: " + newName;
                    } else if (parts[i].toLowerCase().contains("age") && field.equals("age")) {
                        System.out.print("Enter new Age: ");
                        int newAge = sc.nextInt(); sc.nextLine();
                        parts[i] = " Age: " + newAge;
                    } else if (parts[i].toLowerCase().contains("course") && field.equals("course")) {
                        System.out.print("Enter new Course: ");
                        String newCourse = sc.nextLine();
                        parts[i] = " Course: " + newCourse;
                    } else if (parts[i].toLowerCase().contains("marks") && field.equals("marks")) {
                        System.out.print("Enter new Marks: ");
                        double newMarks = sc.nextDouble(); sc.nextLine();
                        parts[i] = " Marks: " + newMarks;
                    }
                }

                // Rebuild the line
                line = String.join(",", parts);
            }
            sb.append(line).append("\n");
        }
        br.close();

   
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write(sb.toString());
        bw.close();

        if (found) {
            System.out.println("Record updated successfully!");
        } else {
            System.out.println("No record found for ID: " + id);
        }
    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }
}

void Delete() {
    try {
        System.out.print("Enter the ID you want to delete: ");
        String deleteId = sc.nextLine();

        File inputFile = new File("Student.txt");
        File tempFile = new File("Temp.txt");

        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));

        String line;
        boolean deleted = false;

        while ((line = br.readLine()) != null) {
            if (line.contains("ID: " + deleteId)) {
                System.out.println("Deleted: " + line);
                deleted = true;
                continue; 
            }
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();

        inputFile.delete();
        tempFile.renameTo(inputFile);

        if (deleted) {
            System.out.println("Record deleted successfully.");
        } else {
            System.out.println("No record found for ID: " + deleteId);
        }
    } catch (IOException e) {
        System.out.println("Error " + e.getMessage());
    }
}

}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student Record");
            System.out.println("5. Delete Student Record");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    sc.nextLine();
                    student.add(name, id, age, course, marks);
                    break;

                case 2:
                    student.View();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    String searchId = sc.nextLine();
                    student.Search(searchId);
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    String updateId = sc.nextLine();
                    student.Update(updateId);
                    break;

                case 5:
                    student.Delete();
                    break;

                case 6:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}

