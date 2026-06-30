class Mobiles {
    private String brand;
    private int battery;
    private boolean isOn;

    Mobiles(String brand, int battery) {
        setBrand(brand);
        setBattery(battery);
        isOn = false;
    }

    void setBrand(String brand) {
        if (brand != null && !brand.isBlank())
            this.brand = brand;
        else
            System.out.println("Invalid Brand");
    }

    void setBattery(int battery) {
        if (battery >= 0 && battery <= 100)
            this.battery = battery;
        else
            System.out.println("Invalid Battery Percentage");
    }

    void turnOn() {
        if (battery == 0)
            System.out.println("Battery Empty. Charge your phone.");
        else {
            isOn = true;
            System.out.println("Phone Turned On");
        }
    }

    void turnOff() {
        isOn = false;
        System.out.println("Phone Turned Off");
    }

    void charge(int amount) {
        battery += amount;
        if (battery > 100)
            battery = 100;
    }

    void displayStatus(){
        if(isOn == true){
            System.out.println("the phone is on");
        }
        else
            System.out.println("the phone is off");
    
        System.out.println("the amount battery present in the phone is: " + battery);

    }
    void usePhone(int a){
        battery-=a;
        System.err.println("the amount of battery after using phone is: " + battery);

    }
    




}

public class MobilePhone {
    public static void main(String[] args) {
        Mobiles phone = new Mobiles("Samsung", 50);

        phone.turnOn();
        phone.usePhone(20);
        phone.charge(30);
        phone.displayStatus();
        phone.turnOff();
    }
}