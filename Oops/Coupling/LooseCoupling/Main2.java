package Oops.Coupling.LooseCoupling;

// Step 1: Define abstraction (common rule)
interface PaymentService{
    void pay(double amount);
}

// Step 2: Implementations
class CreditCardPayment implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UpiPayment implements PaymentService{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class PayPalPayment implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}

// Step 3: High-level class depends on abstraction
class PaymentProcessor {
    private final PaymentService paymentService; // 💡 depends on interface, not concrete class

    // Constructor Injection
    public PaymentProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void process(double amount) {
        paymentService.pay(amount);
    }
}

// Step 4: Main - runtime selection
public class Main2 {
    public static void main(String[] args) {

        PaymentService upi = new UpiPayment();
        PaymentService paypal = new PayPalPayment();

        PaymentProcessor processor1 = new PaymentProcessor(upi);
        processor1.process(2500);

        PaymentProcessor processor2 = new PaymentProcessor(paypal);
        processor2.process(4999);

    }
}
