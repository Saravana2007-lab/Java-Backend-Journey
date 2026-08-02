package Collections.Stack;
import java.util.Scanner;
import java.util.Stack;
public class ReverseStack {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();

          for(int i = 0; i < str.length(); i++){
            st.push(str.charAt(i));
        }

           System.out.print("Reversed String: ");
        while(!st.isEmpty()){
            System.out.print(st.pop());
        }
    }
}
