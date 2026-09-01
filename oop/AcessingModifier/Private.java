package LessonJava.oop.AcessingModifier;

class Private {
    private String name = "Long menyoeung";

    private void display (){
        System.out.println("Private :" + name);
    }

     String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
