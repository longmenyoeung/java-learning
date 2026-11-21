
import java.util.ArrayList;


public class ScorteAnalysis {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
    
        numbers.add(90);
        numbers.add(92);
        numbers.add(78);
        numbers.add(95);
        numbers.add(88);

        double total = 0;
        int count=0;
        int heighest = numbers.get(0);

        for (int number : numbers) {
            total +=number;
            count ++;

            //find heighest scores
            if(number > heighest){
                heighest = number;
            }

        }

        double average = total  / count;



        //print all data
        System.out.println("List of score :" +numbers);
        System.out.println("Total score :" + total);
        System.out.println("Average :" + average);
        System.out.println("Highest score :"+ heighest);

    }
}
