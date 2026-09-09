package LessonJava.oop.AbstractClass.Exercise.EmployeeSys;

public abstract class Employee {
    int id;
    String name;
    int age;
    Employee(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //Abstract method
    public  abstract double calculateSalary();

    //normal method
    public void displayEmployee(){
        System.out.println("========= Employee Information ===========");
        System.out.println("ID :" +id);
        System.out.println("Name :" +name);
        System.out.println("Age :" + age);
    }
}
