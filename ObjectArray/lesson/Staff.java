package LessonJava.ObjectArray.lesson;

import java.util.Scanner;

public class Staff {
    private long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String phone;
    private double salary;
    private String address;

    Staff (){} //Default constructor
    Staff (
            long id,
            String firstName,
            String lastName,
            String gender,
            String email,
            String phone,
            double salary,
            String address
    ){
        this.id =id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.address = address;
    }

    //input
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID : "); id = input.nextLong();
        input.nextLine();
        System.out.print("Enter Firstname : "); firstName = input.nextLine();
        System.out.print("Enter Lastname : "); lastName  = input.nextLine();
        System.out.print("Enter Gender : "); gender = input.nextLine();
        System.out.print("Enter Email : "); email = input.nextLine();
        System.out.print("Enter Phone : "); phone = input.nextLine();
        System.out.print("Enter Salary : $"); salary = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Address : "); address = input.nextLine();
//        input.nextLine();
    }

    //getters
    public long getId(){return id;}
    public String getFirstName(){return  firstName;}
    public String getLastName(){return  lastName;}
    public String getGender(){return email;}
    public String getPhone(){return phone;}
    public double getSalary(){return salary;}
    public String getAddress(){return address;}

    //setters
    public void setId(long id){this.id= id;}
    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setEmail (String email) {this.email= email;}
    public void setGender(String gender){this.gender = gender;}
    public void setPhone(String phone){this.phone = phone;}
    public void setSalary (double salary){this.salary =salary;}
    public void setAddress(String address){this.address = address;}


    //display headers
    public static void headers(){
        System.out.printf("%10s %15s %15s %10s %17s %15s %10s %20s \n",
                "ID", "Fname", "Lname", "Gender", "Email", "Phone", "Salary", "Address");
    }

    //display information
    public void display(){
        System.out.printf("%10d %15s %15s %10s %27s %15s %10.2f %20s \n",
                id, firstName, lastName, gender, email, phone,salary,address);
    }

}
