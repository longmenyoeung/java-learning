import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FilterEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(12, 5, 8, 19, 24, 7, 30, 3));

        Collections.sort(numbers); //sorted numbers

        for(int number : numbers){
            if(number % 2  == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
