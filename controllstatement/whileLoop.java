package LessonJava.controllstatement;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = input.nextInt();
        int i = 1;
        while (i <= n){
            if(i % 2 == 0){
                System.out.println("Odds value :" + i);
            }else{
                System.out.println("Even value :" + i);
            }
            i ++;
        }
    }
}
