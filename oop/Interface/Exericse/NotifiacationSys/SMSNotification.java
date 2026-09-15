package LessonJava.oop.Interface.Exericse.NotifiacationSys;

public class SMSNotification implements  Notification{
    private String smsMessage ;
    SMSNotification (String smsMessage){this.smsMessage = smsMessage;}
    @Override
    public void send(String message) {
        System.out.println("Sending sms to ["+smsMessage+ "] :" +message);
    }
}
