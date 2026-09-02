package LessonJava.oop.Inheritance;

public class ClassA {
    protected int a;
    protected   int b;

    public int sum(){
        return  a + b;
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }

    public void methodA (){
        System.out.println("Method in class A");
    }
}
