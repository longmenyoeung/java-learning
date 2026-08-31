package LessonJava.oop;

public class CategoryEncapulation {
    private  int id;
    private String name;
    private  String desc;

    //constructor
    public CategoryEncapulation(int id, String name, String desc){
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    // Encapsulation  getters and setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDesc(){
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
