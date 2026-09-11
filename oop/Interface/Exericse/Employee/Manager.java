package LessonJava.oop.Interface.Exericse.Employee;

public class Manager implements Employee{


    @Override
    public void work() {
        System.out.println("Manager is managing the team");
    }

    @Override
    public double calculateSalary() {
        return 1500;
    }
}
