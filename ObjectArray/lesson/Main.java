package LessonJava.ObjectArray.lesson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Staff[] staffs = new Staff[500]; //object arr fix size
        int n= 0, i, option, optionUpdate;
        double idSearch;
        do{
            System.out.println("======= Menu ==========");
            System.out.println("1. Input Staff");
            System.out.println("2. Show all staff");
            System.out.println("3. Search staff by ID");
            System.out.println("4. Update staff by ID");
            System.out.println("5. Exit");
            System.out.println("========================");

            System.out.print("Input your choice (1-5) : "); option = input.nextInt();

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

                case  4 :
                    System.out.println("============== UPDATE STAFF DATA ================");
                    System.out.print("Input staff ID you want to search :"); int searchId = input.nextInt();
                    int isfoundId = 0;
                   for(i = 0; i<n; i++){
                       if(staffs[i].getId() == searchId){
                           do {
                               System.out.println("======= MENU UPDATE ==========");
                               System.out.println("1. BY FIRST NAME");
                               System.out.println("2. BY LAST NAME ");
                               System.out.println("3. BY GENDER");
                               System.out.println("4. BY EMAIL");
                               System.out.println("5. BY PHONE");
                               System.out.println("6. BY SALARY");
                               System.out.println("7. BY ADDRESS");
                               System.out.println("8. BACK");
                               System.out.println("========================");
                               System.out.print("Input your choice (1-8) :"); optionUpdate = input.nextInt();

                               String firstname;String lastname; String gender;String phone;String email;String address;
                               double salary;
                               switch (optionUpdate){
                                   case 1:
                                       System.out.print("New firstname :"); firstname = input.nextLine();
                                       staffs[i].setFirstName(firstname);
                                       break;
                                   case 2:
                                       System.out.print("New lastname :"); lastname = input.nextLine();
                                       staffs[i].setLastName(lastname);
                                       break;
                                   case 3:
                                       System.out.print("New gender :"); gender = input.nextLine();
                                       staffs[i].setGender(gender);
                                       break;
                                   case 4:
                                       System.out.print("New phone :"); phone = input.nextLine();
                                       staffs[i].setPhone(phone);
                                       break;
                                   case 5:
                                       System.out.print("New salary :"); salary = input.nextDouble();
                                       staffs[i].setSalary(salary);
                                       break;
                                   case 6:
                                       System.out.print("New email:"); email = input.nextLine();
                                       staffs[i].setEmail(email);
                                       break;
                                   case 7:
                                       System.out.print("New address :"); address =input.nextLine();
                                       staffs[i].setAddress(address);
                                       break;
                               }

                           }while (optionUpdate != 8);
                           isfoundId = 1;
                           break;
                       }
                   }
                   if(isfoundId == 0){
                       System.out.println("Not staff found in list.");
                   }
                   break;
            }
        }while(option != 5);




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
