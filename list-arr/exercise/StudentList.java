
import java.util.ArrayList;


public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("nak");
        name.add("men");
        name.add("mama");
        name.add("mey");
        name.add("na");
        name.add("my");
        name.add("rann");
        name.add("thea");


        name.set(2, "ma ma");
        System.out.println(name);

        name.remove(0);
        System.out.println(name);

        System.out.println("Total student name : "+name.size());

        //display name 
        for(String n : name) {
            System.out.println("- " + n);
        }

    }
}