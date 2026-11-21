package arr_list_obj.exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class InventoryMain {
    public static void main(String[] args) {
        //creat list obj to store data
        ArrayList<Product> products = new ArrayList<>();


        //add Products
        products.add(new Product(1, "Laptop", 499.99, 3));
        products.add(new Product(2, "Mouse", 10, 4));
        products.add(new Product(3, "Monitor", 500, 30));

        //calculate total price
        double totalPrice = 0;
        for(Product p : products) {
            totalPrice += p.getPrice()  * p.getQty();
        }

        //find product low qty
        System.out.println("==== Product low qty ===");
        for(Product p : products) {
            if(p.getQty() < 5) {
                System.out.println(p.getName() + " In Stcok: " + p.getQty());
            }
        }


        //find product update by Id
        Scanner input = new Scanner(System.in);
        System.out.print("Enter search product : ");
        int searchId = input.nextInt();

        for(Product p : products)
        {
            if(p.getId() == searchId){
                //Update infomation
                p.setName("Mac book");
                p.setPrice(2299.99);
                p.setQty(20);
            }

            System.out.println(p);
        }

        System.out.println("Total product price in stock: "+totalPrice);


    }
}
