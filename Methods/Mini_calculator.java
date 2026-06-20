// Mini Calculator
// Author - Saravana

import java.util.Scanner;

public class Mini_calculator {
    public static float add(float a, float b) {
        return a + b;
    }

    public static float sub(float a, float b) {
        return a - b;
    }

    public static float multi(float a, float b) {
        return a * b;
    }

    public static float divide(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            System.out.print("Enter first number: ");
            float first = scanner.nextFloat();

            System.out.print("Enter second number: ");
            float second = scanner.nextFloat();

            System.out.print("Enter operation (1.+,2. -,3. *,4. /): ");
            int op = scanner.nextInt();
   scanner.close();
        
            float result;
            switch (op) {
                case '+':
                    result = add(first, second);
                    break;
                case '-':
                    result = sub(first, second);
                    break;
                case '*':
                    result = multi(first, second);
                    break;
                case '/':
                    result = divide(first, second);
                    break;
                default:
                    System.out.println("Unknown operation: " + op);
                    return;
                    
            }

            System.out.println("Result: " + result);
        
         
    }
}
