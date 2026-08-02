package Collections.Stack;
import java.util.Stack;

import java.util.Stack;

class Copy {
    Stack<Integer> cp = new Stack<>();

    void copy(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();

        
        while (!s.empty()) {
            temp.push(s.pop());
        }

        while (!temp.empty()) {
            int val = temp.pop();
            s.push(val);   
            cp.push(val);  
        }
        System.out.println("The orginal stack");
        while(!s.empty()){
            System.out.print(s.pop() + ",");
        }     
         System.out.println("\n The copy stack");
        while(!cp.empty()){
            System.out.print(cp.pop() + ",");
        }
    }
}

public class StackCopy {
   public static void main(String[] args) {
    Copy c = new Copy();
    Stack<Integer> orginal = new Stack<>();
    orginal.push(1);
    orginal.push(2);
    orginal.push(3);
    orginal.push(4);
    orginal.push(5 );
        c.copy(orginal);
   
   } 
}
