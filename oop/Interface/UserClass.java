package LessonJava.oop.Interface;

class UserClass implements  UserInterface{
    @Override
    public void email() {
        System.out.println("Email :  menyoeung@gmail.com");
    }

    @Override
    public void password() {
        System.out.println("Password : Menyoeung20056");
    }

}
