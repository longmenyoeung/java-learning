package LessonJava.oop;

import java.util.Scanner;

public class Brand {
    int id;
    String name, desc, fromCountry;
    int code ;


    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.println("====== Input information ======");
        System.out.print("Enter ID = "); id = input.nextInt();
        input.nextLine();
        System.out.print("Enter Name = "); name = input.nextLine();
        System.out.print("Enter Code = "); code = input.nextInt();
        System.out.print("Enter Desc = "); desc = input.nextLine();
        input.nextLine();
        System.out.print("Enter From Country = "); fromCountry = input.nextLine();
    }


    public void  header() {
        System.out.printf("%10s %15s %10s %17s %15s \n", "ID", "NAME", "CODE", "DESCRIPTION", "FROM COUNTRY");
    }

    public void output() {
        System.out.printf("%10d %15s %10d %17s %15s \n", id,name,code,desc,fromCountry);
    }
}
