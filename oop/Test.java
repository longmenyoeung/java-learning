package LessonJava.oop;
import java.util.Scanner;

class Test {
    //data members
    private int x; //access modifer private, protect, public
    private  int y;

    //method menmbers input/output
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input information");
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