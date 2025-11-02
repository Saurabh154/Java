package Oops.Interface;

// Interface with all types of members
interface Device {

    // 1️⃣ Constant (static variable)
    int MAX_BATTERY = 100; // public static final by default

    // 2️⃣ Abstract method (must be implemented)
    void turnOn();
    void turnOff();

    // 3️⃣ Default method (has body, can be overridden)
    default void showBatteryStatus(int level) {
        System.out.println("Battery: " + level + "%");
        checkBattery(level); // calling private method inside default
    }

    // 4️⃣ Private method (helper, used inside interface)
    private void checkBattery(int level) {
        if (level < 20) {
            System.out.println("⚠️ Low Battery! Please charge soon.");
        } else {
            System.out.println("Battery level is good.");
        }
    }

    // 5️⃣ Static method (belongs to interface itself)
    static void deviceInfo() {
        System.out.println("📱 Device Interface - provides device operations");
        System.out.println("Max battery capacity: " + MAX_BATTERY + "%");
    }
}


// ✅ Implementing class
class Smartphone implements Device {

    // Implementing abstract methods
    public void turnOn() {
        System.out.println("Smartphone turned ON");
    }

    public void turnOff() {
        System.out.println("Smartphone turned OFF");
    }

    // Optional: Override default method
    @Override
    public void showBatteryStatus(int level) {
        System.out.println("🔋 Checking battery for smartphone...");
        Device.super.showBatteryStatus(level); // call parent version
    }
}


// ✅ Main class to test everything
public class WhatsComesInsideInterface {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();

        // Calling implemented abstract methods
        phone.turnOn();

        // Calling overridden default method
        phone.showBatteryStatus(15);

        // Accessing constant (static variable)
        System.out.println("Maximum Battery Capacity: " + Device.MAX_BATTERY + "%");

        // Calling static method of interface
        Device.deviceInfo();

        phone.turnOff();
    }
}

/*

🧭 INTERVIEW INSIGHTS

Q1: Can we access checkBattery() from class?
➡️ ❌ No, it’s private inside interface.

Q2: Can we override static method from interface?
➡️ ❌ No, static methods are not inherited.

Q3: Can interface hold data or state?
➡️ ❌ Only constants (public static final variables), not mutable state.

Q4: How to call interface’s default method from child class?
➡️ Using InterfaceName.super.methodName() (like Device.super.showBatteryStatus()).

“Default method allows us to add new functionality in an interface
without forcing all old implementing classes to reimplement that new method.”

 */