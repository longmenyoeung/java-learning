package LessonJava.oop.AbstractClass.Exercise.EmployeeSys;

public class PartTimeEmployee extends Employee{

    PartTimeEmployee(int id, String name, int age){
        super(id, name, age);
    }

    public double salary(double hoursWorked ,double hourRate){
        double totalPay = hoursWorked * hourRate;
        double tax = 0;
        double findPercent ;
        double cutAmount ;
        double finalTal ;

        if(totalPay >= 500){
            tax = 30;
            findPercent = tax / 100;
            cutAmount = totalPay * findPercent;
            finalTal = totalPay - cutAmount;
            return  finalTal;

        } else if (totalPay <= 400 & totalPay >=300) {
            tax = 30;
            findPercent = tax / 100;
            cutAmount = totalPay * findPercent;
            finalTal = totalPay - cutAmount;
            return  finalTal;
        }else{
            tax = 0;
            findPercent = tax / 100;
            cutAmount = totalPay * findPercent;
            finalTal = totalPay - cutAmount;
            return finalTal;
        }
    }

    @Override
    public double calculateSalary() {
        return salary(50, 10);
    }
}
