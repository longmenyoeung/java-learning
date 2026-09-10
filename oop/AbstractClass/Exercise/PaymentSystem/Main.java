package LessonJava.oop.AbstractClass.Exercise.PaymentSystem;

import lesson.SwitchCase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CashPayment cp= new CashPayment(200, 200);
        CreditCardPayment cdp = new CreditCardPayment(50000);

        System.out.println("Choose you options :");
        System.out.println("1 .Cash by hand.");
        System.out.println("2 .CreditCard");

        System.out.print("Enter your choice :"); int n = input.nextInt();

        switch (n){
            case 1 :
                cp.processPayment();
                System.out.println("Fee : $"+cp.calculateFee());
                break;
            case 2:
                cdp.processPayment();
                System.out.println("Final amount : $"+cdp.calculateFee());
                break;
            default:
                System.out.println("Input invalid number.");
                break;
        }
    }
}
