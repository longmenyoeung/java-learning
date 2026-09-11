package LessonJava.oop.Interface.Exericse.Area;

public class Main {
    public static void main(String[] args) {
        Ragtangle r = new Ragtangle(200, 50);
        Circle c = new Circle(90);

        System.out.println("Ragtangle :" + r.area());
        System.out.println("Circle :" + c.area());
    }
}
