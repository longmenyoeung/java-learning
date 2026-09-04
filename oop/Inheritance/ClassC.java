package LessonJava.oop.Inheritance;

public class ClassC extends ClassA{
    int c;

    public int sum(){
        return a + b  + c;
    }

    public void getC(int c){
        this.c = c;
    }
}
