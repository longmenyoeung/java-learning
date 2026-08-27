package LessonJava.controllstatement.exercise;

public class loopStatement {
    public static void main(String[] args) {
        int total = 0;
        for (int i=40; i>=5; i=i-5){
//            System.out.println(i);
            total += i;
        }
//        40 - 35 - 30 --- 5 = ?
        System.out.println("Total descrease:"+total);

        float totalmul= 1;
        for (int i = 2 ; i<=30; i = i + 2) {
             totalmul *= i;
//            System.out.println(i);
        }
        // 2 * 4 * 6 ..... 30 = ?
        System.out.println("total mul :" + totalmul);

    }
}
