package LessonJava.oop.AbstractClass.Exercise.AnimalSystem;

public class Cat extends  Animal {
    String sound;
    Cat(String name, String color, int age, String sound){
        super(color, name, age);
        this.sound = sound;
    }


    @Override
    String makeSound() {
        return sound;
    }
}
