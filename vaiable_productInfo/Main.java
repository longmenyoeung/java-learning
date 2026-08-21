package LessonJava.vaiable_productInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pId, qty;
        String pName, pDes;
        double price, discount;

        System.out.println("=====Product Information ======");
        System.out.print("Enter product ID :"); pId = input.nextInt();
        input.nextLine();
        System.out.print("Enter product name :"); pName = input.nextLine();
        System.out.print("Enter product des :"); pDes = input.nextLine();
        System.out.print("Enter product price :"); price = input.nextDouble();
        System.out.print("Enter product qty :"); qty = input.nextInt();
        System.out.print("Enter product discount :"); discount = input.nextDouble();

        System.out.println("=====Product details =========");
        //original total amount
        double total = qty * price;
        //discountAmount
        double discountAmount = total * (discount / 100);
        //final amount
        double totalPriceAfterDiscount  = total- discountAmount;
        System.out.println("ID :" + pId);
        System.out.println("Name :" + pName);
        System.out.println("Description :" + pDes);
        System.out.println("Price : $" + price);
        System.out.println("Quantity :" + qty);
        System.out.println("Discount : %" +discount);
        System.out.println("Original Total: $" + total);
        System.out.println("Total amount of discount :$" + discountAmount);
        System.out.println("Final Price: $" + totalPriceAfterDiscount);
    }
}
