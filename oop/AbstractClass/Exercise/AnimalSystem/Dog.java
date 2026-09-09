package LessonJava.oop.AbstractClass.Exercise.AnimalSystem;

public class Dog extends Animal{
    String sound;
    Dog(String name, String color, int age, String sound){
        super(color, name, age);
        this.sound = sound;
    }

    @Override
    String makeSound(){
        return  sound;
    }
}
