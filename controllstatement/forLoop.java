package LessonJava.controllstatement;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n = "); int n = input.nextInt();
        for(int i=0; i<n; i++) {
            if(i % 2 ==0 ) continue;
            System.out.println(i);
        }
    }
}
