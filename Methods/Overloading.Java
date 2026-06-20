/* Overloading in Java
 * author Saravana
 */
import java.util.Scanner;

public class Overloading {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultoftwo = add(10, 20);
        int resultofthree = add(10, 20, 30);
        System.out.println(resultoftwo);
        System.out.println(resultofthree);
        sc.close();
    }
}