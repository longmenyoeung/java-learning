package LessonJava.oop.AcessingModifier;

public class Main {
    public static void main(String[] args) {

        //Can be accessed from anywhere.
        //Public accessing
       Public pub = new Public();
       pub.display();

       //This will not work outside the class
       //Private accessing
        Private pri = new Private();
        //pri.display(); // Error because cant access
        //Solution and getters and setters
        pri.setName("Men Private");
        System.out.println(pri.getName());


        //Protected accessing
        // Can be accessed :
        // - access in the same class
        //- access in the same package
        // - access in subclasses (inheritance)
        Protected2 pt2 = new Protected2();
        pt2.show();


        // Default (Package-Private)
        //If you don't write any modifier, it becomes default access.
        Default d = new Default();
        d.display();

    }
}
