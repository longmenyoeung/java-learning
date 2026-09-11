package LessonJava.oop.Interface.Exericse.Employee;

class Developer implements Employee{
    @Override
    public void work() {
        System.out.println("DEVELOPER writing code");
    }

    @Override
    public double calculateSalary() {
        return 10000;
    }
}
