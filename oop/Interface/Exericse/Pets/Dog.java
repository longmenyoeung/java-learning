package LessonJava.oop.Interface.Exericse.Pets;

class Dog implements Animal{

    private String color;

    Dog(String color){
        this.color = color;
    }

    //encapsulation.
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color  = color;
    }



    @Override
    public void eat(){
        System.out.println("beef");
    }

    @Override
    public void sound(){
        System.out.println("Woof woof");
    }

}
