package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class TicketBookingQueue {
    Queue<String> tickets = new LinkedList<>();
    void addCustomer(String name){
        tickets.offer(name);
        System.out.println(name + " joined the Queue");
    }
    void serveCustomer(){
        if(!tickets.isEmpty()){
            System.out.println("Serving "+ tickets.poll());
        }
        else{
            System.out.println("No customers waiting.");
        }
    }
    void showQueue(){
        System.out.println("Wating Customers");
        System.out.println("-------------");
        System.out.println(tickets);
    }
    public static void main(String[] args) {
        TicketBookingQueue ticket = new TicketBookingQueue();
        ticket.addCustomer("Saravana");
        ticket.addCustomer("Akshat");
        ticket.addCustomer("Sumanth");
        ticket.showQueue();
        ticket.serveCustomer();

    }
}
