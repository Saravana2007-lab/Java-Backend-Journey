// Anagram Check
// Author - Saravana
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println("enter a word");
                String word = sc.nextLine().toLowerCase();
                System.out.println("enter the second word");
                String word2 = sc.nextLine().toLowerCase();
                char[] a = word.toCharArray();
                char[] b = word2.toCharArray();
             Arrays.sort(a);
             Arrays.sort(b);
    if(Arrays.equals(a,b)){
        System.out.println("it is an anagram");
    }
    else{
         System.out.println("it is not an anagram");
    }
                 sc.close();
        }
}
