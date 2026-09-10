package LessonJava.oop.AbstractClass.Exercise.PaymentSystem;

public class CreditCardPayment extends Payment{
    CreditCardPayment(double amount){
        super(amount);
    }

    public double Bonus(double amount){
        double findPercent = 5.0 / 100;
        double plusPrice = amount * findPercent;
        System.out.println("Bonus fee : $" + plusPrice);
        return amount + plusPrice;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment : $"+amount);
    }

    @Override
    public double calculateFee() {
        return Bonus(amount);
    }
}
