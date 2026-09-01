package LessonJava.oop.Exercise;

public class Brandtypesconstructor {
    private int id;
    private String name ;
    private String code;
    private String fromCountry;


    // constructor with params
    public Brandtypesconstructor(int id, String name, String code, String fromCountry){
        this.id = id;
        this.name = name;
        this.code = code;
        this.fromCountry =fromCountry;
    }


    //defaults constructor
    public Brandtypesconstructor(){
        this.id = 1;
        this.name= "coca";
        this.code = "mm";
        this.fromCountry = "USA";
    }




    public void output(){
        System.out.println("ID " +id);
        System.out.println("NAME " + name);
        System.out.println("CODE " + code);
        System.out.println("FROM COUNTRY "  +fromCountry);
    }
}
