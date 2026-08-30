package LessonJava.oop;

import java.util.Scanner;

public class Product {
    private String name;
    private int qty;
    private double price;
    private String productBrand;
    private String desc;


    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("============= Input Information ==============");
        System.out.print("Enter product name = "); name = input.nextLine();
        System.out.print("Enter product brand = "); productBrand = input.nextLine();
        System.out.print("Enter product price = "); price = input.nextDouble();
        System.out.print("Enter product qty = "); qty = input.nextInt(); input.nextLine();
        System.out.print("Enter product desc = "); desc = input.nextLine();

    }

    public  void header () {
        System.out.printf("%10s %14s %12s %10s %18s %12s %n", "NAME", "BRAND", "PRICE", "QUANTITY", "DESCRIPTION", "TOTAL");
    }

    public void output () {
        double total = price * qty;
        System.out.printf("%10s %14s %12.2f %10d %18s  %12.2f %n", name, productBrand, price, qty,desc, total);
    }

}
