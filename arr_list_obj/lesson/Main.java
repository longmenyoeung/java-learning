package arr_list_obj.lesson;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //1. create ArrayList to store Student object
        ArrayList<Student> students = new ArrayList<>();

        //2. Add students to list
        students.add(new Student(101, "Dara", 45.5));
        students.add(new Student(102, "Bopha", 60.5));
        students.add(new Student(103, "Vathana", 85.5));


        //3. display all students
        System.out.println("===== Student list =====");
        for(Student s : students){
            s.display();
        }

        //find student by
        System.out.println(" ============ Find student by Id =========");
        int searchId = 102;
        Student foundStudent = null;
        
        for(Student s : students) {
            if(s.getId() == searchId) {
                foundStudent = s;
                break; //ពេលរកឃើញហើយ​ ឈប់ Loop
            }
        }

        if(foundStudent != null){
            System.out.println("Student ID found " + foundStudent.getName() + " Score " + foundStudent.getScore());
        }else{
            System.out.println("Not found student with ID " + searchId);
        }


        //find student passed exam
        System.out.println(" ============Student passed Exam=========");
        for(Student s : students) {
            if(s.getScore() >= 50) {
                s.display();
            }
        }


        //find student with top scorer
        System.out.println(" ============ Find student with top scorer ============");
        Student topScorer = students.get(0);

        for(Student s : students){
            if(s.getScore() >= topScorer.getScore()){
                topScorer = s;
            }
        }

        System.out.println("Top scorer is " + topScorer.getName() + " Score :" + topScorer.getScore());

    }
}
