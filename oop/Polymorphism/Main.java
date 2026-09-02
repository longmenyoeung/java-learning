package LessonJava.oop.Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        🧠 The Most Important Concept
//        Parent reference = new Child();
//        For example:Animal animal = new Dog();


        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();


        Payment pay = new Payment();
        Payment aba  =new ABA();
        Payment aceleda = new Aceleda();

        pay.Pay();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of bank :"); int n = input.nextInt();

        switch (n) {
            case 1 :
                aba.Pay();
                break;
            case 2 :
                 aceleda.Pay();
                 break;
            default:
                System.out.println("Invalid bank");
                break;
        }

    }
}
