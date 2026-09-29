package LessonJava.ObjectArray.Exercise.ProductManagement;

import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private double price;
    private int qty;


    Product(){}
    Product(int id, String name, double price, int qty){
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    //input  product information
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("================= Input Product information ==================");
        System.out.print("Enter product id  = "); id = input.nextInt(); input.nextLine();
        System.out.print("Enter product name = "); name = input.nextLine();
        System.out.print("Enter product price = "); price = input.nextDouble(); input.nextLine();
        System.out.print("Enter product qty = "); qty = input.nextInt();
    }

    // display output of product
    public void headers(){
        System.out.printf("%10s %10s %10s %10s \n", "ID", "NAME", "PRICE", "QTY");
    }

    public void display(){
        System.out.printf("%10d %10s %10.2f %10d \n", id, name, price, qty);
    }


    //getters
    public int getId(){return id;}
    public String getName(){return  name;}
    public double getPrice(){return  price;}
    public int getQty (){return qty;}

    //setters
    public void setId(int id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setPrice(double price){this.price= price;}
    public void setQty(int qty){this.qty = qty;}

    

}
