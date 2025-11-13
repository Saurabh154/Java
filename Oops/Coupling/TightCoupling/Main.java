package Oops.Coupling.TightCoupling;

class EmailService {
    public void sendEmail(String message){
        System.out.println("Email sent : " + message);
    }
}

class Notification {
    private final EmailService emailService = new EmailService();

    public void send(String message){
        emailService.sendEmail(message);
    }
}
public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification();
        notification.send("Hello, user!!");
    }
}

