package LessonJava.oop.AbstractClass;

class Circle extends Shape{
    double radius;

    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius;
    }
}
