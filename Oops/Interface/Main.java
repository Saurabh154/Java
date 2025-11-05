package Oops.Interface;

//Loose Coupling Example


interface PaymentGateway {
    abstract void payment();
    void refund();
}

class Paytm implements PaymentGateway {

    @Override
    public void payment() {
        System.out.println("Payment done by PAYTM");
    }

    @Override
    public void refund() {
        System.out.println("Refund done by PAYTM");
    }
}


class PhonePay implements PaymentGateway {

    @Override
    public void payment() {
        System.out.println("Payment done by PHONE PAY");
    }

    @Override
    public void refund() {
        System.out.println("Payment done by PHONE PAY");
    }
}

class GooglePay implements PaymentGateway {

    @Override
    public void payment() {
        System.out.println("Payment done by GOOGLE PAY");
    }

    @Override
    public void refund() {
        System.out.println("Payment done by GOOGLE PAY");
    }
}

class MakePayment{
    void doPaymentBy(PaymentGateway p){
        p.payment();
        p.refund();
    }
}


public class Main {
    public static void main(String[] args) {
        MakePayment  mp = new MakePayment();
        mp.doPaymentBy(new Paytm());
        mp.doPaymentBy(new PhonePay());
        mp.doPaymentBy(new GooglePay());
    }
}

