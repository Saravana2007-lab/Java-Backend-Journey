package Interfaces;
interface Deliverable {
    void deliverOrder();
}


interface Trackable {
    void trackLocation();
}



class BikeDelivery implements Deliverable {
    public void deliverOrder() {
        System.out.println("Bike Delivery Partner delivered the order.");
    }
}

class DroneDelivery implements Deliverable, Trackable {
    public void deliverOrder() {
        System.out.println("Drone Delivery Partner delivered the order.");
    }
    public void trackLocation() {
        System.out.println("Drone location: Customer is 2 km away.");
    }
}

class RobotDelivery implements Trackable {
    public void trackLocation() {
        System.out.println("Robot location: Reached Building Entrance.");
    }
}

class PremiumDelivery implements Deliverable, Trackable {
    public void deliverOrder() {
        System.out.println("Premium Delivery Partner delivered the order.");
    }
    public void trackLocation() {
        System.out.println("Premium Delivery: Live GPS tracking enabled.");
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        
      
        Deliverable[] deliveries = {
            new BikeDelivery(),
            new DroneDelivery(),
            new PremiumDelivery()
        };
        
        for (Deliverable d : deliveries) {
            d.deliverOrder();
        }
        
        System.out.println("-------------------------");
  
        Trackable[] trackers = {
            new DroneDelivery(),
            new RobotDelivery(),
            new PremiumDelivery()
        };
        
        for (Trackable t : trackers) {
            t.trackLocation();
        }
    }
}
