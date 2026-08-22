package LessonJava.controllstatement;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int day ;
//        System.out.print("Enter day :");
//        day = input.nextInt();
//
//        switch (day) {
//            case 1 :
//                System.out.println("Monday");
//                break;
//            case 2 :
//                System.out.println("Tousday");
//                break;
//            case 3 :
//                System.out.println("Wednesday");
//                break;
//            default:
//                System.out.println("Invalid input.");
//                break;
//        }

        //Modern Switch Expression with String
        String role;
        System.out.print("Enter role :"); role =input.nextLine();
        switch (role){
            case "admin" -> System.out.println("Welcome admin.");
            case "manager" -> System.out.println("Welcome manager");
            default -> System.out.println("Unknow role.");
        }

        //Tranditional Switch with string
        String name ;
        System.out.print("Enter user name :"); name = input.nextLine();

        switch (name) {
            case "men" :
                System.out.println("u are our staff");
                break;
            case "kaka" :
                System.out.println("u are our staff");
                break;
            default:
                System.out.println("Not my staff");
                break;
        }
    }
}
