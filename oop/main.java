package LessonJava.oop;

//Class Test
public class main {
    public static void main(String[] args) {
        //Create obj from class
        Test test1 = new Test();
        //Call method
        test1.input(); //--> access class member
        test1.output(); // -> access class member

        Demo01 demo1 = new Demo01();
        demo1.input();
        demo1.header();
        demo1.output();
    }
}
