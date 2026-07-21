// Checks whether an element in the array is even or odd. 
// author - Saravana
import java.util.Scanner;

import java.util.ArrayList;

public class even_or_odd_in_array {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int a = sc.nextInt();

        int[] b = new int[a];

        System.out.println("Enter array elements:");

     for(int i = 0; i < a; i++){
            b[i] = sc.nextInt();
        }
          sc.close();
    ArrayList<Integer> even = new ArrayList<>();
ArrayList<Integer> odd = new ArrayList<>();

for (int i = 0; i < a; i++) {
    if (b[i] % 2 == 0) {
        even.add(b[i]);
    } else {
        odd.add(b[i]);
    }
}

System.out.println("Even numbers: " + even);
System.out.println("Odd numbers: " + odd);   
    }
  

}