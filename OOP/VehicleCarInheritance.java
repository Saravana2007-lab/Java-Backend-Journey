class Vehicle{
    String brand;
    int speed;
void displayVehicle(){
  System.out.println("brand:   "+ brand);
    System.out.println("speed:   "+ speed);
}
}
class Car extends Vehicle{
    int numberOfDoors;
    void displayCar(){
        System.err.println("Doors:    "+ numberOfDoors);
    }
}


public class VehicleCarInheritance {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand="BMW";
        c.speed = 137;
        c.numberOfDoors=2;
        c.displayVehicle();
        c.displayCar();
    }
}
