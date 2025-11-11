package Oops.Coupling.LooseCoupling;

interface MessageService {
    void sendMessage(String message);
}

class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SmsService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class Notification{
    private final MessageService messageService;

    // Constructor injection
    public Notification(MessageService messageService){
        this.messageService = messageService;
    }

    public void send(String message){
        messageService.sendMessage(message);
    }

}
public class Main {
    public static void main(String[] args) {
        // You can easily switch between services
        MessageService email = new EmailService();
        MessageService sms = new SmsService();

        Notification notification1 = new Notification(email);
        notification1.send("Welcome via Email!!");

        Notification notification2 = new Notification(sms);
        notification2.send("Welcome via SMS!!");
    }
}
