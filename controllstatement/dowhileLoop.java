package LessonJava.controllstatement;

import java.util.Scanner;

public class dowhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n = "); int n = input.nextInt();
        int i = 1;
        do {
//            System.out.println("do-while :" + i);
            if(i % 2 != 0){
                System.out.println("Even numbers :" + i);
            }else{
                System.out.println("Odds numbers :" + i);
            }
            i ++;
        }while (i<= n);
    }
}
