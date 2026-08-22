package LessonJava.controllstatement;

import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variable info
        String name;
        int cpp, cshap, java;

        System.out.print("Enter name :"); name = input.nextLine();
        System.out.print("Enter score cpp :"); cpp = input.nextInt();
        System.out.print("Enter score C sharp :"); cshap = input.nextInt();
        System.out.print("Enter score java : "); java = input.nextInt();

        // total avg
        double totalScore = cpp + cshap + java;
        double avg = totalScore / 3;

        if(avg >= 90 && avg <=100) {
            System.out.print("A");
        } else if (avg >=80 && avg<90) {
            System.out.println("B");
        }else{
            System.out.println("F");
        }

        System.out.println("Total score  :" + totalScore);
        System.out.println("Total avg :" + avg);

    }
}
