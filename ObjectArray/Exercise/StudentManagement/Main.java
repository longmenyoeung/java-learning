package LessonJava.ObjectArray.Exercise.StudentManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student[] students = new Student[5];

        int n = 0, i, options;

        do {
            System.out.println(" =============== Student Manu =================");
            System.out.println("1. Input student information ");
            System.out.println("2. Show all students list");


            //choose options
            System.out.print("Enter you options : "); options = input.nextInt();
            input.nextLine();

            switch (options){
                case 1:
                    students[n] = new Student();
                    System.out.println(" ============= INPUT STUDENT INFORMATION ============");
                    students[n].input();
                    n++;
                    break;
                case 2:
                    System.out.println("============ STUDENT LIST ===========");
                    Student.header();
                    for(i=0; i<n; i++){
                        students[i].display();
                    }
                    break;
                case 3: break;
                case 4: break;
                case 5: break;
            }
        }while (options !=6);


    }

}
