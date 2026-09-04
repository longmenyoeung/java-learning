package LessonJava.oop.Inheritance;

public class Main {
    public static void main(String[] args) {
        ClassA objA = new ClassA();
        objA.setA(19);
        objA.setB(91);
        System.out.println("Sum :" + objA.sum());

        ClassB objB= new ClassB();
        objB.setA(9);
        objB.setB(9);
        objB.setZ(9);
        objB.methodB();
        System.out.println("Sum :" + objB.sum());

        ClassC objC= new ClassC();
        objC.methodA();



    }
}
