package Oops.Interface;

interface PaymentGateway {
    void pay(double amount);
}

class Paytm implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Paytm");
    }
}

class PhonePe implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via PhonePe");
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentGateway p = new Paytm();
        p.pay(500);
    }
}

