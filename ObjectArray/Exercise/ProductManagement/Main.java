package LessonJava.ObjectArray.Exercise.ProductManagement;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Coca", 3.4, 20);
        product.setId(2);
        product.headers();
        product.display();
    }
}
