package arr_list_obj.exercises;

public class Product {
    //1 .attr fields
    private int id;
    private String name;
    private double price;
    private int qty;


    //2. Constructor
    public Product (int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }



    //3. getters 
    public int getId(){return id;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public int getQty(){return qty;}

    //4. setters 
    public  int setId(int id) {return this.id = id;}
    public  String setName(String name) {return this.name = name;}
    public  double  setPrice(double price) {return this.price = price;}
    public  int  setQty(int qty) {return this.qty = qty;}



    //display products
    public  void displayProduct() {
        System.out.println("ID: " + id);
        System.out.println("NAME: " + name);
        System.out.println("PRICE: " + price);
        System.out.println("QAUNTITY: " + qty);
        System.out.println("======================");
    }


    //dispay with update 
    @Override 
    public String toString (){
        return "Product[ID=" + id + ", Name=" + name + ", Price=" + price + "qty=" + qty + "]";
    }





}
