package LessonJava.oop.AbstractClass.Exercise.AnimalSystem;

public class Main {
    public static void main(String[] args) {
        Cat cOjb = new Cat("Buddy", "Gray", 2, "Woof Woof");
        cOjb.displayInfo();
        System.out.println("Cat makes :"+cOjb.makeSound());

        Dog dObj = new Dog("HevHev", "Orange", 1, "Meow Meow");
        dObj.displayInfo();
        System.out.println("Dog makes :"+dObj.makeSound());
    }
}
