//count vowels
//author- Saravana
import java.util.Scanner;
public class countvowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an word");
        String word = sc.nextLine();
        int vowels = 0;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
        }

        
        System.out.println("Number of vowels: " + vowels);
        sc.close();
    }
}
