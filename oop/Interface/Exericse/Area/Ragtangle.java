package LessonJava.oop.Interface.Exericse.Area;

class Ragtangle implements Shape{

    double width, height;

    Ragtangle(double width, double height){
        this.width =width;
        this.height = height;
    }

    public double area(){
        return width * height;
    }
}
