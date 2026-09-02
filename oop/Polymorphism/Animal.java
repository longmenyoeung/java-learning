package LessonJava.oop.Polymorphism;

public class Animal {
    void sound(){
        System.out.println("Animal make a sound.");
    }
}

class Dog extends Animal {

    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound(){
        System.out.println("Cat maws");
    }
}
