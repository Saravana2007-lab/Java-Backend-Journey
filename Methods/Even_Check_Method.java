// Even Check Method
// Author - Saravana


import java.util.Scanner;

public class Even_Check_Method {
    public static boolean iseven(int a) {
        return a % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        if (iseven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
