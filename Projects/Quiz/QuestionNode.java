package Projects.Quiz;
class QuestionNode {
    question data;
    QuestionNode next;

    QuestionNode(question newQuestion){
       this.data = newQuestion;
       this.next = null;
     
    }

    public String getQuestion() { return data.getQuestion(); }
    public String getOptionA() { return data.getOptionA(); }
    public String getOptionB() { return data.getOptionB(); }
    public String getOptionC() { return data.getOptionC(); }
    public String getOptionD() { return data.getOptionD(); }
    public char getAnswer() { return data.getAnswer(); }

}