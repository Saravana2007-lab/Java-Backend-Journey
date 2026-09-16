package FileHandling;
import java.io.File;
import java.io.IOException;
public class FileOperations {
    public static void main(String[] args) {
        
    
    try{
        File file = new File("Student.txt");
      if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
    }
  catch(IOException e){
            System.out.println("Error "+ e.getMessage());
        }
}
}
