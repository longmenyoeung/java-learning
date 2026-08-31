package LessonJava.oop;

public class Array {
    public static void main(String[] args) {
        int [] myArr1 = new int[7];


        System.out.println( myArr1[0] = 10);
        System.out.println(  myArr1[1] = 20);
        System.out.println( myArr1[2] = 30);

        //for loop
        for (int i = 0; i<myArr1.length; i++) {
            if(myArr1[i] == 0){
                continue;
            }
            System.out.println("Index ["+i+"] = " + myArr1[i] + " Values");
        }

        //forEach
        for (int item : myArr1){
            if(item == 0){
                continue;
            }
            System.out.println("Values : " +item);
        }
    }
}
