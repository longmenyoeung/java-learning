
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        //create LinkList
        LinkedList<String> cars = new LinkedList<>();
        LinkedList<String> history = new LinkedList<>();
        LinkedList<String> songs = new LinkedList<>();

        //add elements
        cars.add("Toyota"); //normal adding element
        cars.addFirst("Moto"); // បន្ថែមនៅក្បាលគេបង្អស់
        cars.addLast("Bycycle"); //បន្ថែមនៅកន្ទុយគេបង្អស់

        // System.out.println(cars.getFirst()); //មើលធាតុនៅក្បាលគេ
        // System.out.println(cars.getLast()); //មើលធាតុនៅក្រោយគេ

        // System.out.println(cars.removeLast()); //remove last element
        // System.out.println(cars.removeFirst()); //remove first element

        //display all data
        for(String car : cars) {
            System.out.println(car);
        }



        history.push("Home page");
        history.push("Product page");
        history.push("Checkout page");

        // ចុច Back (ដកទំព័រចុងក្រោយចេញមុន)
        System.out.println("ចាកចេញពី" + history.pop()); //checkout page
        System.out.println("ពុងនៅទំពរ" + history.peek()); //Product page



        songs.add("Song A");
        songs.add("Song B");
        songs.add("Song C");

        ListIterator<String> it = songs.listIterator();
        System.out.println(" ==== ដើរទៅមុខ =====");
        while (it.hasNext()) {
            System.out.println("Next :" + it.next());
        }

        System.out.println("=== ដើរថយក្រោយ ===");
        while (it.hasPrevious()){
            System.out.println("Prev :" + it.previous());
        }

    }
}
