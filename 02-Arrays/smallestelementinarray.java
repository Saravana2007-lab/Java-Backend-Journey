
import java.util.Scanner;

public class SmallestElementInArray  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int a = sc.nextInt();

        int[] b = new int[a];

        System.out.println("Enter array elements:");

        for(int i = 0; i < a; i++){
            b[i] = sc.nextInt();
        }

        int smallest = b[0];

        for(int i = 1; i < a; i++){
            if(b[i] < smallest){
                smallest = b[i];
            }
        }

        System.out.println("smallest element = " + smallest);

        sc.close();
    }
}