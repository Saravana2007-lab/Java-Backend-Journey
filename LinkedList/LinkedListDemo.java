package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        Node second = new Node(20);   
        Node first = new Node(10); 
        Node third = new Node(30);   
        first.next = second;     
        second.next = third;     

        System.out.println("First node data: " + first.data);
        System.out.println("Second node data: " + second.data);
        System.out.println("third data:"+ third.data   );
    }
}
