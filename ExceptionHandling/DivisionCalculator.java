package ExceptionHandling;
import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int numerator = sc.nextInt();
        int denominator = sc.nextInt();
      
        try{
        int c = numerator/denominator;
        System.out.println("Numinator divided by denominator is:    "+c);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }

    }
}
