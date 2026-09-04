package LessonJava.oop.Polymorphism.EmployeeManagemenSystem;

abstract class Employee {
    int id;
    private String name;
    private String email;
    private double baseSalary;

    public Employee(int id, String name, String email, double baseSalary){
        this.id = id;
        this.name = name;
        this.email = email;
        this.baseSalary = baseSalary;
    }


    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id= id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setNameAndSetEmail(String name, String email){
        this.name = name;
        this.email = email;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    // 1. DEFINE THE METHOD HERE IN THE PARENT CLASS
    public double calculateSalary(){
        return baseSalary;  // Default behavior: regular employees get just base salary
    }


    public void display(){
        System.out.println(" ========= Information ============");
        System.out.println("ID : " +id);
        System.out.println("Name : " + name);
        System.out.println("Email : " +email);
        System.out.println("Base Salary : "+ baseSalary);
    }

}
