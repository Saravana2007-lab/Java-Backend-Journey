// Varargs Method
// Author - Saravana

public class VarargsAverage {

    public static double calculateAverage(double... numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        double total = 0;
        for (double number : numbers) {
            total += number;
        }

        return total / numbers.length;
    }

    public static void main(String[] args) {
        System.out.println("Average of 10 and 20: " + calculateAverage(10, 20));
        System.out.println("Average of 10, 20, 30, and 40: "
                + calculateAverage(10, 20, 30, 40));
        System.out.println("Average without values: " + calculateAverage());
    }
}