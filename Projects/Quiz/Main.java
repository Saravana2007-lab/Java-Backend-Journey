package Projects.Quiz;
import Projects.Quiz.question;
import Projects.Quiz.QuestionNode;

public class Main {
public static void main(String[] args) {
  question q1 = new question(
            "Who is the king",
            "Saravana",
            "Aaron",
            "Boovan",
            "Nihal",
            'a'
        );

        question q2 = new question(
            "Who is the Strong",
            "Saravana",
            "Aaron",
            "Boovan",
            "Nihal",
            'a'
        );
QuestionNode first = new QuestionNode(q1);
QuestionNode second = new QuestionNode(q2);
first.next = second;
   QuestionNode current = first;
        while (current != null) {
   System.out.println("Q: " + ..getQuestion());
System.out.println("A: " + current.getOptionA());
System.out.println("B: " + current.getOptionB());
System.out.println("C: " + current.getOptionC());
System.out.println("D: " + current.getOptionD());
  System.out.println("----------------------");
  current = current.next;
        }
}

}
