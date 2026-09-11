package LessonJava.oop.Interface.Exericse.Area;

class Circle implements Shape{

    double radius;
    Circle(double radius){this.radius=radius;}

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
