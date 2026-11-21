import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FilterEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(12, 5, 8, 19, 24, 7, 30, 3));


        //if i 
        Collections.sort(numbers); //sorted numbers

        for(int number : numbers){
            if(number % 2  == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println("\n");

        //search numbers with step one
        if(numbers.contains(19)){ // use [contain] when want values that true or false
            int index = numbers.indexOf(19); // use [indexof] to find what exactly index in arr lists. 
            System.out.println("Found index at :" + index);
        }else{
            System.out.println("Not found.");
        }


        //search numbers with step two
        int index = Collections.binarySearch(numbers, 19);

        if(index >=0) {
            System.out.println("Found index at : " + index);
        }else{
            System.out.println("Not found.");
        }


        


    }
}
