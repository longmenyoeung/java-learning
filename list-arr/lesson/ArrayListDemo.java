import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // create arr list to store fruid data
        ArrayList<String> fruits = new ArrayList<>();


        //add more elements
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("bannana");
        System.out.println("Results :" + fruits);


        //get value by index
        String firstFruit = fruits.get(0);
        System.out.println("First fruit : " + firstFruit);


        //set value
        String setValue = fruits.set(1, "Mango");
        System.out.println("Orignal value : " + setValue + " after set value :" + fruits.get(1));

        //remove value by index
        String delete = fruits.remove(2);
        System.out.println("Deleted :" + delete);
        System.out.println(fruits);

        //look total elements 
        System.out.println("Total elements : " + fruits.size());


        //use loop to display all data
        for(String f : fruits){
            System.out.println("- " + f);
        }
    }
}