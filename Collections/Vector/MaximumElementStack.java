package Collections.Vector;
import java.util.Stack;

class Max {
    void max(Stack<Integer> m) {
        int currentMax = m.pop();
        while (!m.empty()) {
            int current = m.pop();
            if (current > currentMax) {
                currentMax = current;
            }
        }
        System.out.println("THe max value is: "+    currentMax);   
    }

}

public class MaximumElementStack {
    public static void main(String[] args) {
        
Max m = new Max();
Stack<Integer> s = new Stack<>();
s.push(1);
s.push(654);
s.push(433);
s.push(434);
s.push(32);
s.push(345);
m.max(s);
    }

}
