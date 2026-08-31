package LessonJava.oop.Exercise;

public class Main {
    public static void main(String[] args) {
        ProductEncapsulation p1 = new ProductEncapsulation(1, "Laptop", 200.99);

        //getters from Product class
        System.out.println(" ======== Original information =========");
        System.out.println("Product ID :" +p1.getId());
        System.out.println("Product name :" + p1.getName());
        System.out.println("Product price :" + p1.getPrice());

        //setter and new information
        p1.setId(2);
        p1.setName("Mobile");
        p1.setPrice(999);
        System.out.println(" ======== New  information =========");
        System.out.println("Product ID :" +p1.getId());
        System.out.println("Product name :" + p1.getName());
        System.out.println("Product price :" + p1.getPrice());
    }
}
