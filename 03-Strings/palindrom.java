//palindrom with string
//author - Saravana
import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an word");
        String word = sc.nextLine();
        String rev ="";
        for(int i = word.length()-1;i>=0;i--){
            rev += word.charAt(i);
        }
        if(word.equals(rev)){
            System.out.println("it is an palindrom");
        }
               else{
            System.out.println("it is not an palindrom");
        }
        sc.close();
    }
    
}
