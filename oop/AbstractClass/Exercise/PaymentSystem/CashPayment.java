package LessonJava.oop.AbstractClass.Exercise.PaymentSystem;

public class CashPayment extends Payment{
    double cash;

    CashPayment(double amount, double cash){
        super(amount);
        this.cash = cash;
    }

    public double Bonus(double cash){
        return 0;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing cash payment : $"+amount);
    }


    @Override
    public double calculateFee() {
        return Bonus(100);
    }
}
