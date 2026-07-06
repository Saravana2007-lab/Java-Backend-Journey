package Interfaces;

interface Switchable {
    void turnOff();
    void turnOn();
}

class SmartLight implements Switchable {

    @Override
    public void turnOff() {
        System.out.println("Lights off");
    }

    @Override
    public void turnOn() {
        System.out.println("Lights on");
    }
}

class SmartFan implements Switchable{
    @Override
    public void turnOff() {
        System.out.println("fans off");
    }
    @Override
    public void turnOn(){
        System.out.println("fans On");
    }
}
class SmartSpeaker implements Switchable{
    @Override
    public void turnOff() {
        System.out.println("Speakers off");
    }
    @Override
    public void turnOn(){
        System.out.println("Speakers On");
    }
}
public class SmartHomeSystem {
    public static void main(String[] args) {
        Switchable[] sw = {
            new SmartLight(),
            new SmartFan(),
            new SmartSpeaker()        
        };
        for(Switchable s : sw){
            s.turnOff();
            s.turnOff();
            System.out.println("---------------------");
        }
    }
  
}