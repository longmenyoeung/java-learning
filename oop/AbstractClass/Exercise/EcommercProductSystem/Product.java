package LessonJava.oop.AbstractClass.Exercise.EcommercProductSystem;

public abstract class Product {
    int id, stock;
    String name;
    double price;


    Product(int id, String name, double price, int stock){
        this.id = id;
        this.name = name;
        this.price= price;
        this.stock = stock;
    }

    public abstract double calculateDiscount();

    public double getFinalPrice (){
        return this.price * this.stock;
    }

    public void disPlay (){
        System.out.println("========= Product information ======");
        System.out.println("ID :" + id);
        System.out.println("Name :" + price);
        System.out.println("Stock :" + stock);
    }


}
