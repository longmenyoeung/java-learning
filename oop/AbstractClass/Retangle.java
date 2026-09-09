package LessonJava.oop.AbstractClass;

class Retangle extends  Shape{
    double width, height;

    Retangle(String color, double width, double height){
      super(color);
      this.width = width;
      this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

}
