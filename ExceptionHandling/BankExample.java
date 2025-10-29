package ExceptionHandling;

class BankExample {
    void withdraw(int amount) throws Exception {
        int balance = 5000;
        if (amount > balance) {
            throw new Exception("Insufficient balance!");
        } else {
            System.out.println("Withdraw successful!");
        }
    }

    public static void main(String[] args) {
        BankExample b = new BankExample();
        try {
            b.withdraw(7000);
        } catch (Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}

//🧠 withdraw() declares throws Exception
//→ main() must handle it using try-catch.