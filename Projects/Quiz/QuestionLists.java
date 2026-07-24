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
        tail = null;
        System.out.println("List is empty.");
        return;
    }
    if(q.getQuestion().equals(head.getQuestion())){
        temp = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }
    else{
        QuestionNode prev = null;
        boolean found = false;
        while(current != null){
            if(q.getQuestion().equals(current.getQuestion())){
                prev.next = current.next;
                if(current == tail){
                    tail = prev;
                }
                found = true;
                break;
            }
            prev = current;
            current = current.next;
        }
        if(!found){
            System.out.println("Question not found");
        }
    }
}
}