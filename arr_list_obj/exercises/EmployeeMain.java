package arr_list_obj.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Boolean running = true;
        boolean isFound = false;


        while (running) {

            System.out.println("1. Process again.");
            System.out.println("2. Show all data.");
            System.out.println("3. Filter by department.");
            System.out.println("4. Remove data");
            System.out.println("5. Update data");
            System.out.println("6. Exit.");
            System.out.print("Enter option :");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter department: ");
                    
                    String department = sc.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();

                    employees.add(new Employee(id, name, department, salary));

                    System.out.println("Added successfully.");

                    break;
                case 2:
                    System.out.println("Show data successfully.");
                    //សាកល្បងស្រាវជ្រាវវិធី Sort ដោយប្រើ Comparator (Lambda expression):
                    // តម្រៀបទំនិញពីតម្លៃទាប ទៅ ខ្ពស់
                    employees.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
                    for (Employee emp : employees) {
                        emp.display();
                    }
                    break;
                case  3 :
                    System.out.println(" ============ Filter by department ==========");
                    sc.nextLine();
                    System.out.print("Search to filter in department :"); 
                    String search = sc.nextLine();

                    for(Employee emp : employees) {

                        if(search.equalsIgnoreCase(emp.getDepartment())){
                            System.out.println(" --------- Found department -------------");
                            isFound = true;
                            emp.display();
                        }

                    }


                    if(!isFound){
                        System.out.println("Employee department not found.");
                    }

                    break;
                case 4 :
                    System.out.println(" ============= Remove data ===========");
                    System.out.print("Enter search ID :"); 
                    int deleted = sc.nextInt();
                    
                    for(int i=0; i<employees.size(); i++){
                        if(employees.get(i).getId() == deleted){
                            employees.remove(i);
                            isFound = true;
                            System.out.println("Employee deleted successfully.");
                            break;
                        }
                    }

                    if(!isFound){
                        System.out.println("Employee id not found.");
                    }
                break;
                case 5:
                    System.out.println(" ============= Update data ===========");
                    System.out.print("Enter search ID :"); int searchId = sc.nextInt();

                    for(int i=0; i< employees.size(); i++){
                        if(employees.get(i).getId() == searchId){
                            isFound = true;
                            int choice;
                            
                            do {

                                //block code to process to update
                                System.out.println("======== Menu =======");
                                System.out.println("1. Name");
                                System.out.println("2. Department");
                                System.out.println("3. Salary");
                                System.out.println("4. Exit");
                                
                                System.out.print("Please choose option :"); 
                                choice = sc.nextInt();
                                sc.nextLine();

                                switch (choice) {
                                    case 1:
                                        System.out.print("Enter new name : "); 
                                        String newName = sc.nextLine().trim();
                                        employees.get(i).setName(newName);
                                        System.out.println("Name updated");
                                        break;
                                    case 2:
                                        System.out.println("Enter new department : ");
                                        String newDepartment  = sc.nextLine();
                                        employees.get(i).setDepartment(newDepartment);
                                        System.out.println("Department updated");
                                        break;
                                    case 3:
                                        System.out.println("Enter new salary : ");
                                        double newSalary = sc.nextDouble();
                                        employees.get(i).setSalary(newSalary);
                                        System.out.println("Salary updated");
                                        break;
                                    default:
                                        System.out.println("Invalid options !.");
                                }
                            } while (choice !=4);
                            

                        }
                    }

                    if(!isFound){
                        System.out.println("Employee is not found.");
                    }

                    break;
                case 6:
                    System.out.println("Closed application successfully.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option !.");
            }

        }

    }
}
