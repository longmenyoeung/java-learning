package LessonJava.oop.Interface.Exericse.Employee;

public class Main {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.work();
        System.out.println("Developer salary : $"+d.calculateSalary());

        Designer designer = new Designer();
        designer.work();
        System.out.println("Designer salary : $"+designer.calculateSalary());

        Manager manager = new Manager();
        manager.work();
        System.out.println("Manager salary : $"+manager.calculateSalary());
    }
}
