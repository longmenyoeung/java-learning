package arr_list_obj.lesson;

public class Student {
     //1. Attributes (feiled)
    private  int id;
    private String name;
    private  double score;

    // 2. Constructor (សម្រាប់កំណត់តម្លៃពេលបង្កើត Object)
    public Student () {}
    public Student (int id, String name, double score){
        this.id = id;
        this.name = name;
        this.score = score;
    }

    //3. getters (សម្រាប់ទាញយកតម្លៃមកប្រើ)
    public int getId(){return id;}
    public String getName() {return name;}
    public double getScore() {return score;}

    // 4. toString() method (សំខាន់ខ្លាំង៖ ដើម្បីឱ្យពេល System.out.println បង្ហាញអក្សរស្អាត 
    //មិនចេញលេខកូដ Memory)
    public void display () {
        System.out.println("======================");
        System.out.println("ID :" + id);
        System.out.println("NAME :" + name);
        System.out.println("SCORE :" + score);
        System.out.println("======================");
    }
}
