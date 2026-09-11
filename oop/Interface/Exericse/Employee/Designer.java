package LessonJava.oop.Interface.Exericse.Employee;

class Designer implements Employee{

    @Override
    public void work() {
        System.out.println("Designer is designing UI");
    }

    @Override
    public double calculateSalary() {
        return 900;
    }
}
