package Projects.Quiz;


class QuestionLists{
    private QuestionNode head;
    private QuestionNode tail;
    public void NewQuestion(question q){
        QuestionNode newnode = new QuestionNode(q);
        if(head == null){
            head = newnode;
            tail = newnode;
            prev = newnode;
        }
        else{
            tail.next = newnode;
            prev = tail;
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
     boolean found = false;
while(current != null){
    if(current.getQuestion().equals(question)){
       System.out.println("Question found at position " + i);
        found = true;
         break;
    }
    i++;
    current = current.next;
}
if(!found){
System.out.println("Question not found"); 
}
}

void Delete(question q){
    QuestionNode temp;
      QuestionNode current = head;
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if(q.getQuestion().equals(head.getQuestion())){
            temp =head;
            head = head.next;
        }
        else{
            while(current != null){
                if(q.getQuestion().equals(current.getQuestion())){
                    temp = current;
                    current = current.next;
                    prev =
                }
              }
        }
}
}