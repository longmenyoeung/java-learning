package LessonJava.ObjectArray.lesson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Staff[] staffs = new Staff[500]; //object arr fix size
        int n= 0, i, option;
        double idSearch;
        do{
            System.out.println("======= Menu ==========");
            System.out.println("1. Input Staff");
            System.out.println("2. Show all staff");
            System.out.println("3. Search staff by ID");
            System.out.println("4. Exit");
            System.out.println("========================");

            System.out.print("Input your choice (1-4) : "); option = input.nextInt();

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
                case 3 :
                    System.out.println(" ============ SEARCH STAFF INFO =========");
                    System.out.print("Please input staff to search ID : "); idSearch = input.nextDouble();
                    int isFound = 0;
                    for(i = 0; i< n; i++){
                        if(staffs[i].getId() == idSearch){
                            System.out.println("Staff id have been found!");
                            Staff.headers();
                            staffs[i].display();
                            isFound = 1;
                            break;
                        }
                    }

                    if(isFound == 0){
                        System.out.println("No found in list!");
                    }
                    break;
            }
        }while(option != 4);




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
