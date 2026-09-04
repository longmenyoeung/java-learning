package LessonJava.oop.Polymorphism.EmployeeManagemenSystem;

public class Main {
    public static void main(String[] args) {

        //Developer one
//        Employee dev1 = new Developer("Java", 5, 1, "men", "men@gmail.com", 2000);
//        dev1.display();

        //Developer two
//        Employee dev2 = new Developer("Java", 3, 1, "men", "men@gmail.com", 2000);
//        dev2.setId(2);
//        dev2.setNameAndSetEmail("mama", "mama@gmail.com");
//        dev2.setBaseSalary(1800);
//        dev2.display();


        //Designer onw
//        Employee design = new Designer("Figma", 3,3,"kiki", "kikik@gmail.com", 2300);
//        design.setId(3);
//        design.setNameAndSetEmail("nana", "nana@gmail.com");
//        design.display();


        Employee[] employees = {
                new Developer("Java", 5, 1, "men", "men@gmail.com", 2000),
                new Developer("Java", 2, 2, "mena", "m@gmail.com", 2000),
                new Designer("Figma", 3,3,"kiki", "kikik@gmail.com", 2300)
        };


        for(Employee employee : employees){
            employee.display();
        }

    }
}
