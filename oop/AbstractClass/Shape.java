package LessonJava.oop.AbstractClass;

abstract class Shape {
    String color;
    Shape(String color){
        this.color = color;
    }

    //Normal method
    void displayInfo(){
        System.out.println("Shape color :" + color);
    }

    //Abstract class (No Body)
    abstract double area();
}
