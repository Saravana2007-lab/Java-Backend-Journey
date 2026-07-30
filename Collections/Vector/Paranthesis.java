package Collections.Vector;
import java.util.Stack;

class Bracket {
    Stack<Character> stack = new Stack<>();

    void check(String expression) {
        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    System.out.println("Not Balanced");
                    return;
                }
                char top = stack.pop();
                if (!matches(top, ch)) {
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }
   
    }

}

public class Paranthesis {
    public static void main(String[] args) {
        Bracket bracketChecker = new Bracket();

        bracketChecker.check("{[()]}");   
    }
}
