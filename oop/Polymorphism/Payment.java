package LessonJava.oop.Polymorphism;

public class Payment {
    void Pay(){
        System.out.println(" ---- choose option pay -----");
    }
}

class ABA extends Payment  {
    @Override
    void Pay(){
        System.out.println("Pay by ABA");
    }
}


class Aceleda extends Payment{
    @Override
    void Pay(){
        System.out.println("Pay by ACELEDA");
    }
}