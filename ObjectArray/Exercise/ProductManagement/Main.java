package LessonJava.ObjectArray.Exercise.ProductManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product [] products = new Product[20];
        int n = 0, i, option, isSearch;
        Boolean isFound = false;



        do{

            System.out.println(" ============== Menu ============");
            System.out.println("1. Add Product.");
            System.out.println("2. View All Products.");
            System.out.println("3. Search product by id.");
            System.out.println("4. Update product.");

            System.out.print("Enter your option (1-4) : "); option = input.nextInt(); input.nextLine();
            switch (option){
                case 1 :
                    products[n] = new Product();
                    products[n].input();
                    System.out.println("Product added successfully.");
                    n++;
                    break;
                case 2:
                    Product.headers();
                    for(i=0; i<n; i++){
                        products[i].display();
                    }

                    if(n == 0){
                        System.out.println("Product is empty.");
                    }

                    break;
                case 3:
                    System.out.print("Input search id :"); isSearch = input.nextInt(); input.nextLine();
                    for(i=0; i<n; i++){
                        if (products[i].getId() == isSearch){
                            Product.headers();
                            products[i].display();
                            isFound = true;
                            break;
                        }
                    }

                    if(isFound == false){
                        System.out.println("Product not found.");
                    }

                    break;
                case 4 :
                    System.out.print("Input search id :"); isSearch = input.nextInt(); input.nextLine();
                    for(i= 0; i<n; i ++){
                        if(products[i].getId() == isSearch){
                            System.out.println(" ============== CURRENT DATA =============");
                            Product.headers();
                            products[i].display();

                            do{
                                System.out.println("========== Update Menu =========");
                                System.out.println("1. By product name");
                                System.out.println("2. By product price");
                                System.out.println("3. By product qty");
                                System.out.println("4. Back");

                                System.out.print("Enter option :"); option = input.nextInt(); input.nextLine();
                                switch (option){
                                    case 1 :
                                        System.out.print("New product name :"); String newName = input.nextLine();
                                        products[i].setName(newName);
                                        System.out.print(products[i].getName() + " updated.");
                                        break;

                                    case 2 :
                                        System.out.print("New product price :"); double newPrice = input.nextDouble(); input.nextLine();
                                        products[i].setPrice(newPrice);
                                        System.out.println(products[i].getPrice() + " updated.");
                                        break;
                                    case 3 :
                                        System.out.print("New product qty : "); int newQty = input.nextInt(); input.nextLine();
                                        products[i].setQty(newQty);
                                        System.out.println(products[i].getQty() + " updated.");
                                        break;
                                }

                            }while (option !=4);

                           isFound = true;
                           break;
                        }
                    }

                    if(isFound == false){
                        System.out.println("Product not found.");
                    }
                    break;
                case 5 : break;
            }

        }while ( option != 6);

    }
}
