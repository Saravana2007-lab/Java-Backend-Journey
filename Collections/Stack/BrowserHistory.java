package Collections.Stack;

import java.util.Stack;

public class BrowserHistory {
     Stack<String> back = new Stack<>();
     Stack<String> forward = new Stack<>();
     String currentPage = null;

    void visit(String page) {
        if (currentPage != null) {
            back.push(currentPage);
        }
        currentPage = page;
        forward.clear();
      
    }

    void back(int steps) {
        while(steps > 0 && !back.isEmpty()){
            forward.push(currentPage);
            currentPage = back.pop();
            steps--;
        }
        System.out.println(currentPage);
    }

    void forward(){
      if(!forward.isEmpty()){
        back.push(currentPage);
        currentPage = forward.pop();
      }
         System.out.println(currentPage);
    }

    String currentPage() {
        return currentPage;
    }
    public static void main(String[] args){
        BrowserHistory b = new BrowserHistory();
        b.visit("Google");
         b.visit("youtube");
          b.visit("insta");
           b.visit("github");
            b.visit("snap");
            System.out.println("---------------------");
            b.back(3);
            System.out.println("----------------------");
            b.forward();
             System.out.println("----------------------");
             String a = b.currentPage();
             System.out.println(a);
    }
}
