
//count consonants
//author- Saravana
import java.util.Scanner;
public class Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word");
        String word = sc.nextLine().toLowerCase();
        int consonants = 0;
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                consonants++;
            }
        }
        System.out.println("Number of consonants: " + consonants);
        sc.close();
    }
}
