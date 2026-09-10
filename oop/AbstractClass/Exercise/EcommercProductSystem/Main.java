package LessonJava.oop.AbstractClass.Exercise.EcommercProductSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Electronics el = new Electronics(1, "MACBOOK", 1000, 10);
        Clothing clothing = new Clothing(2, "T-shirt", 55, 10);
        System.out.println("==== Choose your choice ====");
        System.out.println("1. Electronics");
        System.out.println("2 . Clothing");

        System.out.print("Enter number = "); int n = input.nextInt();

        switch (n){
            case 1 :
                el.disPlay();
                System.out.println("Original price : $"+el.getFinalPrice());
                System.out.println("Price after discount : $"+el.calculateDiscount());
                break;
            case 2 :
                clothing.disPlay();
                System.out.println("Original price : $"+clothing.getFinalPrice());
                System.out.println("Price after discount : $"+clothing.calculateDiscount());
                break;
            default:
                System.out.println("Input invalid number.");
                break;
        }
    }
}
