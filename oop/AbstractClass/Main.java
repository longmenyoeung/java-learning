package LessonJava.oop.AbstractClass;

public class Main {
    public static void main(String[] args) {
//        Shape s = new Shape(); //Abstract cant use it for create object
        Shape rObj = new Retangle("Blue", 90, 20);
        Circle cObj = new Circle("Red", 10);

        System.out.println("Area Re = " + rObj.area());
        System.out.println("Area Ci = " + cObj.area());

    }
}
