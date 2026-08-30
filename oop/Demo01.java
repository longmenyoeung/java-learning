package LessonJava.oop;

import java.util.Scanner;

public class Demo01 {
    private int id;
    private String fullName;

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID = "); id = input.nextInt();
        input.nextLine();
        System.out.print("Enter FullName = "); fullName = input.nextLine();
    }

    public void header() {
        System.out.printf("%10s %10s \n", "ID", "FULLNAME");
    }
    public void output(){
        System.out.printf("%10d %10s \n", id, fullName);
    }
}
