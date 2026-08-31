package LessonJava.oop;

//Class Test
public class main {
    public static void main(String[] args) {
        //Create obj from class
//        Test test1 = new Test();
//        //Call method
//        test1.input(); //--> access class member
//        test1.output(); // -> access class member

//        Demo01 demo1 = new Demo01();
//        demo1.input();
//        demo1.header();
//        demo1.output();

//        Brand brand1 = new Brand();
//        brand1.input();
//        brand1.header();
//        brand1.output();
//
//        Product p = new Product();
//        p.input();
//        p.header();
//        p.output();


        CategoryEncapulation cate1 = new CategoryEncapulation(1, "Laptop", "the best ever");
        CategoryEncapulation cate2 = new CategoryEncapulation(2, "Mobile", "the best ever");

        //Obj one
        System.out.println("Category name :" + cate1.getName());
        cate1.setDesc("the best in 2026");
        System.out.println("Category desc :" + cate1.getDesc());

        //Obj two
//        System.out.println("Category name :" + cate2.getName());


    }
}
