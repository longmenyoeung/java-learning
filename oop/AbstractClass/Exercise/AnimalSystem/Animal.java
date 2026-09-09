package LessonJava.oop.AbstractClass.Exercise.AnimalSystem;

public abstract class Animal {
    String color;
    String name;
    int age;

    Animal(String color, String name, int age){
        this.color =color;
        this.name = name;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("===== Animal information =========");
        System.out.println("Name :" + name);
        System.out.println("Color :" + color);
        System.out.println("Age :" + age);
    }
    abstract String makeSound();
}
