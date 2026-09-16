package LessonJava.ObjectArray.lesson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Staff[] staffs = new Staff[500]; //object arr fix size
        int n= 0, i, option;

        do{
            System.out.println("======= Menu ==========");
            System.out.println("1. Input Staff");
            System.out.println("2. Show all staff");
            System.out.println("3. Exit");
            System.out.println("========================");

            System.out.print("Input your choice (1-3) : "); option = input.nextInt();

            switch (option){
                case 1 :
                    staffs[n] = new Staff();
                    staffs[n].input();
                    n ++;
                    break;
                case 2 :
                    System.out.println(" ========== LIST ALL STAFF ============");
                    Staff.headers();
                    for(i = 0; i<n; i++){
                        staffs[i].display();
                    }
                    break;

            }
        }while(option != 3);




//        System.out.print("Input number of staff :"); n = input.nextInt();
        //input staff
//        System.out.println(" =========== Input information of Staff ============");
//        for(i =0; i<n; i++){
//            System.out.println("Index of staff :["+i+"] :");
//            staffs[i] = new Staff();
//            staffs[i].input();
//        }

        //display all staff
//        Staff.headers();
//        for(i=0; i<n; i++){
//            staffs[i].display();
//        }
    }
}
