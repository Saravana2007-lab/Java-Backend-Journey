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
QuestionLists quiz = new QuestionLists();
quiz.NewQuestion(q1);
quiz.NewQuestion(q2);
quiz.display();
 quiz.SerachQuestion("Who is the Strong");
    }
}

