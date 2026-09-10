package LessonJava.oop.AbstractClass.Exercise.PaymentSystem;

public abstract class Payment {
    double amount;

    Payment(double amount){
        this.amount = amount;
    }

    public abstract  void processPayment();

    public abstract double calculateFee();
}
