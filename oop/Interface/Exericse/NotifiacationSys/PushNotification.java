package LessonJava.oop.Interface.Exericse.NotifiacationSys;

public class PushNotification implements Notification{
    private String device;

    PushNotification (String device){
        this.device = device;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending push to devices ["+device+"] :" + message);
    }
}
