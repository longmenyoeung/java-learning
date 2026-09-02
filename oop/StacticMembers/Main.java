package LessonJava.oop.StacticMembers;

public class Main {
    public static void main(String[] args) {
        //Static method
        //-can be called without creating an object;
        //-can access static data and call other static data
        //-Can not use 'this' or 'supper' keywords
        Product.name = "PP";
        System.out.println(Product.name );
    }
}
