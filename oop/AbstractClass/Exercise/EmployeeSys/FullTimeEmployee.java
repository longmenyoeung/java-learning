package LessonJava.oop.AbstractClass.Exercise.EmployeeSys;

public class FullTimeEmployee extends Employee {
    FullTimeEmployee(int id, String name, int age){
        super(id, name, age);
    }

    public double totalSalary(double total){
        double tax = 0;
        double findPercent ;
        double cutAmount ;
        double finalTal ;

        if(total >= 500){
            tax = 30;
            findPercent = tax / 100;
            cutAmount = total * findPercent;
            finalTal = total - cutAmount;
            return finalTal;
        } else if (total == 400) {
            tax = 20;
            findPercent = tax / 100;
            cutAmount = total * findPercent;
            finalTal = total - cutAmount;
            return finalTal;
        }else{
            tax = 10;
            findPercent = tax / 100;
            cutAmount = total * findPercent;
            finalTal = total - cutAmount;
            return finalTal;
        }
    }

    @Override
    public double calculateSalary() {
        return totalSalary(2000);
    }
}
