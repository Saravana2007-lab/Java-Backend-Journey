

class Cal {
    static double add(double a, double b) {
        return a + b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static double multi(double a, double b) {
        return a * b;
    }

    static double div(double a, double b) {
        if (b == 0) {
            System.err.println("Division not possible");
            return 0.0;
        }
        return a / b;
    }
}

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Addition: " + Cal.add(3, 5));
        System.out.println("Subtraction: " + Cal.sub(10, 4));
        System.out.println("Multiplication: " + Cal.multi(6, 7));
        System.out.println("Division: " + Cal.div(20, 5));
    }
}