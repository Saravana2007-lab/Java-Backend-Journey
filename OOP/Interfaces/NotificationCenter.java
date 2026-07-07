package Interfaces;
 interface Notification {
void send();
default void logNotification(){
    System.out.println("Notification logged successfully.");
}
}

class message implements Notification{
    String message;
    message(String message){
        this.message = message;
    }
    @Override
    public void send( ){
        System.out.println("the message has been sent"+message);
    }
}
class EmailNotification extends message implements Notification  {

    EmailNotification(String message){
super(message);
    }
}
class SMSNotification extends message implements Notification  {

    SMSNotification(String message){
super(message);
    }
}

class PushNotification extends message implements Notification  {

    PushNotification(String message){
super(message);
    }
}


public class NotificationCenter {
    public static void main(String[] args) {
        
    
    Notification[] notification ={
        new EmailNotification("email message"),
        new SMSNotification("SMS sent"),
        new PushNotification("push notifaction")
    };

    for(Notification nc : notification){
        nc.send();
        nc.logNotification();
        System.out.println("-----------------------");
    }
}
}
