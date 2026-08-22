package LessonJava.controllstatement;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day ;
        System.out.print("Enter day :");
        day = input.nextInt();

        switch (day) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tousday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
    }
}
