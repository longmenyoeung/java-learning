package LessonJava.oop.Exercise;

public class Array {
    public static void main(String[] args) {

        int [] myArr = new int[4];

        myArr[0] = 10;
        myArr[1] = 20;
        myArr[3] = 30;
//        myArr[4] = 40;

        for(int i =0; i<myArr.length; i++){
            if(myArr[i] == 0) {
                continue;
            }
            System.out.println("index ["+i+"] =  VALUES :"+myArr[i]);
        }

        for(int item : myArr){
            if(item == 0){
                continue;
            }
            System.out.println("VALUES :" + item);
        }

        String [] myStringArr = new String [5];

       myStringArr[0] = "food";
       myStringArr[1] = "mobile";
       myStringArr[2] = "laptop";
       myStringArr[3] = "inphone";
       myStringArr[4] = "drink";

       for(int i = 0; i<myStringArr.length; i++){
           System.out.println("index ["+i+"] =  VALUES :"+myStringArr[i]);
       }
       for(String item : myStringArr){
           System.out.println(item);
       }
    }
}

class Student {
    private String name;
    private int age;
    private String classes;


    //constructor
    public Student(String name, int age, String classes){
        this.name = name;
        this.age = age;
        this.classes = classes;
    }
    //header
    public void header() {
        System.out.printf("%20s %10s %15s \n", "NAME", "AGE", "CLASSES");
    }
    //display data
    public void display(){
        System.out.printf("%20s %10d %15s \n", name, age, classes);
//        System.out.println("Student name : " + name);
//        System.out.println("Student age : " + age);
//        System.out.println("Student class :" + classes);
    }
}