package Oops.MultipleInheritance;

interface RBIBank{
    void rateOfRBI();
}

interface SBIBank extends RBIBank{
    void rateOfSBI();
}

interface HDFCBank extends RBIBank{
    void rateOfHDFC();
}

interface BOIBank extends RBIBank{
    void rateOfBOI();
}

class UsingBank implements SBIBank, HDFCBank, BOIBank{

    @Override
    public void rateOfBOI() {
        System.out.println("Rate for BOI");
    }

    @Override
    public void rateOfHDFC() {
        System.out.println("Rate for HDFC");
    }

    @Override
    public void rateOfSBI() {
        System.out.println("Rate for SBI");
    }

    @Override
    public void rateOfRBI() {
        System.out.println("Rate for RBI");
    }
}


public class Main {

    public static void main(String[] args) {

        System.out.println("For the RBI");
        RBIBank rbi = new UsingBank();
        rbi.rateOfRBI();
        System.out.println();

        System.out.println("For the SBI");
        SBIBank sbi = new UsingBank();
        sbi.rateOfSBI();
        sbi.rateOfRBI();
        System.out.println();

        System.out.println("For the HDFC");
        HDFCBank hdfc = new UsingBank();
        hdfc.rateOfHDFC();
        hdfc.rateOfRBI();
        System.out.println();

        System.out.println("For the BOI");
        BOIBank boi = new UsingBank();
        boi.rateOfBOI();
        boi.rateOfRBI();
        System.out.println();

        System.out.println("For the customer");
        UsingBank user = new UsingBank();
        user.rateOfRBI();
        user.rateOfBOI();
        user.rateOfHDFC();
        user.rateOfSBI();
    }
}
