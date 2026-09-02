package LessonJava.oop.Inheritance;

public class ClassB extends  ClassA{
    int z ;
    public void setZ(int z){
        this.z = z;
    }

    public int sum(){
        return a + b + z;
    }

    public void methodB (){
        methodA();
        System.out.println("Method in class B");
        int test = super.sum();
    }
}
