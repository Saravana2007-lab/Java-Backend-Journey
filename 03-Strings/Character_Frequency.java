//Character Frequency
//author - Saravana
import java.util.Scanner;

public class Character_Frequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an word");
        String word = sc.nextLine();
        char target ='a';
        int count = 0;
        for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch == target){
                count++;
            }
        }
        if(count != 0){
            System.out.println("the word 'a' repeated in the word is :" + count);
        }
               else{
            System.out.println("char not found");
        }
        sc.close();
    }
    
}
