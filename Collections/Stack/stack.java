package Collections.Stack;
import java.util.Stack;
public class stack {
	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
        st.push("Java");
         st.push("C+");
          st.push("python");
          for(String s : st){
            System.out.println(s);
          }
          System.out.println("--------------------");
          System.out.println("the removed was :" + st.pop());
           System.out.println("--------------------");
             for(String s : st){
            System.out.println(s);
          }
	}
}
