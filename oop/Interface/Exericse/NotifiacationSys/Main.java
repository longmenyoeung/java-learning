package LessonJava.oop.Interface.Exericse.NotifiacationSys;

public class Main {
    public static void main(String[] args) {
        EmailNotification email = new EmailNotification("user@gmail.com");
        PushNotification devices = new PushNotification("IOS MODEL IPHONE 19");
        SMSNotification sms = new SMSNotification("+855 44949944");

        String alertMessageEmail = "Your security code is 4432.";
        String alertSms = "Your security code is 903934.";

        //Sending notification
        email.send(alertMessageEmail);
        devices.send(alertMessageEmail);
        sms.send(alertSms);

    }
}
