package Polymorphism;
class Notification{
    void send(){
        System.out.println("notification sent..");
    }
}
class EmailNotification extends Notification{
    @Override
    void send(){
        System.out.println("Email sent..");
    }
}
class SMSNotification extends Notification{
    @Override
    void send(){
        System.out.println("SMS sent..");
    }
}

class PushNotification extends Notification{
    @Override
    void send(){
        System.out.println("Push sent..");
    }
}
public class NotificationSystem {
    public static void main(String[] args) {
        Notification[] nt={
            new EmailNotification(),
            new SMSNotification(),
            new PushNotification()
        };
        for(Notification a : nt){
            a.send();
        }
    }
    
}
