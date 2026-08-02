package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;


public class PrinterQueue {
    Queue<String> Queue = new LinkedList<>();      
    void addDocument(String document){
            Queue.offer(document);
        System.out.println("Successfully added: " + document);
    }
    void printDocument(){
        if (!Queue.isEmpty()) {
            System.out.println("Printing: " + Queue.poll());
        } else {
            System.out.println("No documents to print.");
        }
    }
    void showQueue(){
        System.out.println("The current Queue is " + Queue);
    }
    public static void main(String args[]){
PrinterQueue p = new PrinterQueue();
        p.addDocument("clg.pdf");
        p.addDocument("ncert.img");
        p.addDocument("Dbms.pdf");
        p.showQueue();
        p.printDocument();

    }
}
