package FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateStudentFile {
    public static void main(String[] args) {
      try{
            File file = new File("student.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter writer = new FileWriter("student.txt",true);
            writer.write("Student ID : S101\n");
writer.write("Name : Saravana\n");
writer.write("Department : BCA\n");
writer.close();
        }
        catch(IOException e){
            System.out.println("Error "+ e.getMessage());
        }
        }
        

    }
