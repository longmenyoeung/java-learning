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
            System.out.println("4. Find student by ID : ");


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
                case 4:
                    int isFound = 0;
                    System.out.print("Input student ID : "); int isSearch = input.nextInt();
                    input.nextLine();

                    for(i=0; i< n; i++){
                        if(students[i].getId() == isSearch){
                            System.out.println("Student have been found.");
                            students[i].display();
                            isFound  =1;
                            break;
                        }
                    }

                    if(isFound == 0){
                        System.out.println("No data found.");
                    }

                    break;
                case 5:

                    break;
                case 6: break;
            }
        }while (options !=7);


    }

}
