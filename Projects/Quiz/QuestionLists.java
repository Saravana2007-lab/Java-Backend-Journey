package Projects.Quiz;


class QuestionLists{
    private QuestionNode head;
    private QuestionNode tail;
    public void NewQuestion(question q){
        QuestionNode newnode = new QuestionNode(q);
        if(head == null){
            head = newnode;
            tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
void display() {
    QuestionNode current = head;
    while (current != null) {
        System.out.println("Question: " + current.getQuestion());
        System.out.println("A: " + current.getOptionA());
        System.out.println("B: " + current.getOptionB());
        System.out.println("C: " + current.getOptionC());
        System.out.println("D: " + current.getOptionD());
        System.out.println("Answer: " + current.getAnswer());
        System.out.println("-----------------------------");
        current = current.next;
    }
}
void SerachQuestion(String question){
     QuestionNode current = head;
     int i =1;
     boolean q = false;
while(current != null){
    if(current.getQuestion().equals(question)){
       System.out.println("Question found at position " + i);
        q = true;
         break;
    }
    i++;
    current = current.next;
}
if(!q){
System.out.println("Question not found"); 
}
}
}