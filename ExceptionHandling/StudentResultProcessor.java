package ExceptionHandling;
import java.util.Scanner;
public class StudentResultProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int[] marks = {85, 90, 78};

        try {
           
            System.out.println(marks[5]);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid subject index.");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
        finally {
            System.out.println("Result processing completed.");
        }
    }
}