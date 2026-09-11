package LessonJava.oop.Interface.Exericse.Pets;

public class Man {
    public static void main(String[] args) {
        Dog dog = new Dog("Red");
        dog.eat();
        dog.setColor("Blue");
        System.out.println(dog.getColor());
        dog.sound();
    }
}
