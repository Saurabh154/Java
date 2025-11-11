package Oops.Coupling.TightCoupling;

class Payment {
    public void makePayment(String type) {
        if(type.equals("credit")) {
            System.out.println("Payment done using Credit Card");
        } else if(type.equals("upi")) {
            System.out.println("Payment done using UPI");
        } else if(type.equals("paypal")) {
            System.out.println("Payment done using PayPal");
        } else {
            System.out.println("Invalid payment type");
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.makePayment("upi");
    }
}


/*

🧠 What’s happening here?

# Payment class ko har payment type (credit, upi, paypal) ka logic pata hai.
# Agar kal BitcoinPayment add karna hai →
  ➜ Payment class ke andar code modify karna padega.

# Agar PayPal ka API change ho gaya →
  ➜ fir bhi Payment class todni padegi.

Yani, ek chhoti change puri system ko affect karti hai.
Ye hai tight coupling — har cheez ek dusre se tightly chipki hui hai 🧱

*/