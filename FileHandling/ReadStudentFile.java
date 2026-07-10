package FileHandling;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class ReadStudentFile {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("student.txt");
        BufferedReader reader = new BufferedReader(file);
        
        String line;

while((line = reader.readLine()) != null){

    System.out.println(line);

}
         }
    catch(IOException e){
        System.out.println("Error"+ e.getMessage());
    }
}
    
}
