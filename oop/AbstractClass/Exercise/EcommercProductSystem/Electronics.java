package LessonJava.oop.AbstractClass.Exercise.EcommercProductSystem;

public class Electronics extends Product{
    Electronics(int id, String name, double price, int stock){
        super(id, name, price, stock);
    }

    public double discount(double price){
//        double originalPrice = price * this.stock;
        getFinalPrice();
        double findDecimal = 10.0 / 100;
        double findPercent =  getFinalPrice() * findDecimal;
        return getFinalPrice() - findPercent;
    }

    @Override
    public double calculateDiscount() {
        return discount(price);
    }
}
