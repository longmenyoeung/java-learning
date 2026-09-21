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
            System.out.println("3. Find highest score");


            //choose options
            System.out.print("Enter you options : "); options = input.nextInt();
            input.nextLine();

            switch (options){
                case 1:
                    students[n] = new Student();
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
                case 3:
                    System.out.println("=========== SORT LIST STUDENT ===============");
                    Student studentTmp = new Student();
                    for(i=0; i< n - 1; i++){
                        for (int j = i + 1; j < n; j++){
                            if(students[i].getScore() < students[j].getScore()){
                                studentTmp = students[i];
                                students[i] = students[j];
                                students[j] = studentTmp;
                            }
                        }
                    }
                    System.out.println("Sorted successfully.");
                    break;
                case 4: break;
                case 5: break;
            }
        }while (options !=6);


    }

}
