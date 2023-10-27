import java.util.ArrayList;

public class Student {

    
    int id;
    String name;    
    Course course;

    //Task 4
    ArrayList<Integer> marks = new ArrayList<Integer>();

    
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    
    public void printDetails(){
        System.out.println("ID: " + this.id + "\nName: " + this.name);
        this.course.printDetails();
    }

    public void enroll(Course course){
        this.course = course;
    }
}
