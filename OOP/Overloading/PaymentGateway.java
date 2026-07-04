package Overloading;

class Payment {
    protected String paymentId;
    protected double amount;

    Payment(String paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    void pay() {
        System.out.println("Payment Processing...");
    }
}

// Child class - CreditCard
class CreditCard extends Payment {

    CreditCard(String paymentId, double amount) {
        super(paymentId, amount);
    }

    @Override
    void pay() {
        System.out.println("Payment ID : " + paymentId);
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class UPI extends Payment {

    UPI(String paymentId, double amount) {
        super(paymentId, amount);
    }

    @Override
    void pay() {
        System.out.println("Payment ID : " + paymentId);
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class NetBanking extends Payment {

    NetBanking(String paymentId, double amount) {
        super(paymentId, amount);
    }

    @Override
    void pay() {
        System.out.println("Payment ID : " + paymentId);
        System.out.println("Paid ₹" + amount + " using Net Banking");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {

        Payment p1 = new CreditCard("P101", 5000);
        Payment p2 = new UPI("P102", 2500);
        Payment p3 = new NetBanking("P103", 8000);

        p1.pay();
        System.out.println();

        p2.pay();
        System.out.println();

        p3.pay();
    }
}