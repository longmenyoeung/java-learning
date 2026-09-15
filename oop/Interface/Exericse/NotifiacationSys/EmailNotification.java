package LessonJava.oop.Interface.Exericse.NotifiacationSys;

public class EmailNotification implements  Notification{

    private String emailAddress ;

    EmailNotification (String emailAddress){
        this.emailAddress = emailAddress;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending email to ]"+emailAddress+"] :" + message);
    }


}
