package arr_list_obj.exercises;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    //constructor
    public Employee(int id, String name, String department, double salary){
        this.id =id;
        this.name = name;
        this.department = department;
        this.salary =salary;
    }

    //getters
    public int getId(){return id;}
    public String getName(){return name;}
    public String getDepartment(){return department;}
    public double  getSalary(){return salary;}

    //setters
    public int setId(int id) {return this.id = id;}
    public String setName(String name) {return  this.name = name;}
    public String setDepartment(String department) {return  this.department = department;}
    public double setSalary(double salary) {return this.salary = salary;}


    //display data
    public void display () {
        System.out.println("ID: " + id);
        System.out.println("NAME: " + name);
        System.out.println("DEPARTMENT: " + department);
        System.out.println("SALARY: " + salary);
        System.out.println("=======================");
    }

}
