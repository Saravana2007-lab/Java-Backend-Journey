package Polymorphism;



class Vehicle{
String vehicleNumber;
int rentalDays;
int rent;
Vehicle(String vehicleNumber, int rentalDays){
this.vehicleNumber = vehicleNumber;
this.rentalDays = rentalDays;
}
double calculateRent(){
    return rent* rentalDays;
 }
 void display(){
    double rent = calculateRent();
    System.out.println("vehicle number  "+ this.vehicleNumber);
    System.out.println("Total rent is  "+ calculateRent());
 }
}
class Car extends Vehicle{
    double rent = 2500.50;
Car(String vehicleNumber,int rentalDays){
    super(vehicleNumber, rentalDays);
}
@Override
 double calculateRent(){
    return rent* rentalDays;
 }
  void display(){
    double rent = calculateRent();
    System.out.println("vehicle number  "+ this.vehicleNumber);
    System.out.println("Total rent is  "+ calculateRent());
 }
}
class bike extends Vehicle{
    double rent = 500.50;
bike(String vehicleNumber,int rentalDays){
    super(vehicleNumber, rentalDays);
}
@Override
 double calculateRent(){
    return rent* rentalDays;
 }
  void display(){
    double rent = calculateRent();
    System.out.println("vehicle number  "+ this.vehicleNumber);
    System.out.println("Total rent is  "+ calculateRent());
 }
}
class Truck extends Vehicle{
    double rent = 3500.150;
Truck(String vehicleNumber,int rentalDays){
    super(vehicleNumber, rentalDays);
}
@Override
 double calculateRent(){
    return rent* rentalDays;
 }
  void display(){
    double rent = calculateRent();
    System.out.println("vehicle number  "+ this.vehicleNumber);
    System.out.println("Total rent is  "+ calculateRent());
 }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vc ={
            new Car("KA01AB1234",5),
            new Truck("KA05MK5678",5),
            new bike("TN10CD9876", 3)
        };
        for(Vehicle va : vc){
            va.display();
        }
    }
}
