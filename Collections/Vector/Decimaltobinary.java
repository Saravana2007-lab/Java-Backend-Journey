package Collections.Vector;
import java.util.Stack;

class Conversion {
    Stack<Integer> st = new Stack<>();

    void dtob(int a) {
        while (a != 0) {
            int s = a % 2;
            st.push(s);   
            a = a / 2;    
        }
         System.out.print("Binary: ");
            while (!st.isEmpty()) {
             System.out.print(st.pop());
        }

    }

}

public class Decimaltobinary {
    public static void main(String[] args) {
        Conversion c = new Conversion();
        c.dtob(10);   
          
       }
}
