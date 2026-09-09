package LessonJava.oop.AbstractClass.Exercise.EmployeeSys;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee ftimeEmp = new FullTimeEmployee(1, "men", 21);
        ftimeEmp.displayEmployee();
        System.out.println("Total Salary :" + ftimeEmp.calculateSalary());

        PartTimeEmployee ptimeEmp= new PartTimeEmployee(2, "mama", 27);
        ptimeEmp.displayEmployee();
        System.out.println("Total Salary :" + ptimeEmp.calculateSalary());

    }
}
