package LessonJava.oop;

import java.util.Scanner;

//Class Test
class Test {
    //data members
    private int x; //access modifer private, protect, public
    private  int y;

    //method menmbers input/output
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x = "); x = input.nextInt();
        System.out.print("Enter y = "); y = input.nextInt();
    }

    public  void output(){
        System.out.println("Value x :" + x);
        System.out.println("Value y :" + y);
        //sum
        System.out.println("Value sum :" + (x + y));
        //Sub
        System.out.println("Value Subtraction :" + (x- y));
        //Mul
        System.out.println("Value multiply :" + (x * y));
        //Devison
        System.out.println("Value deveson :" + (x / y));
        //Modular
        System.out.println("Value module :" + (x % y));

    }
}

public class main {
    public static void main(String[] args) {
        //Create obj from class
        Test test1 = new Test();

        //Call method
        test1.input(); //--> access class member
        test1.output(); // -> access class member
    }
}
