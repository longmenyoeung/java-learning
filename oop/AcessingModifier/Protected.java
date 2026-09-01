package LessonJava.oop.AcessingModifier;

class Protected {
    protected String name = "Men Protected";
}

class Protected2 extends Protected {
    public void show(){
        System.out.println(name);
    }
}
