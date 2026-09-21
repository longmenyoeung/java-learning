package LessonJava.ObjectArray.Exercise.StudentManagement;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private double score;

    Student(){};
    Student(int id, String name, int age, double score){
        this.id = id;
        this.name = name;
        this.age= age;
        this.score = score;
    }

    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("============== Input student information ==============");
        System.out.print("Enter ID : "); id = input.nextInt();
        input.nextLine();
        System.out.print("Enter name : "); name = input.nextLine();
        System.out.print("Enter age  : "); age = input.nextInt();
        input.nextLine();
        System.out.print("Enter score : "); score = input.nextDouble();
    }


    static public void header(){
        System.out.printf("%10s %16s %10s %10s", "ID", "NAME", "AGE", "SCORE \n");
    }

    public void display(){
        System.out.printf("%10d %16s %9d %10.2f \n" , id ,name , age , score);
    }


    //getters
    public long getId(){return id;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public double getScore(){return score;}


    //setter;
    public void setId(int id){this.id=id;}
    public void setName(String name){this.name=name;}
    public void setAge(int age) {this.age= age;}
    public void setScore(double score){this.score = score;}


}
