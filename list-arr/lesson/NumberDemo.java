
import java.util.ArrayList;


public class NumberDemo {
    public static void main(String[] args) {
        

        //creat list arr to store data
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(33);

        
        int total = 0;
        for (int num : numbers){
            total += num;
        }
        System.out.println("Total numbers : " + total);

    }
}