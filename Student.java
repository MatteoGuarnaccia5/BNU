import java.util.ArrayList;

public class Student {

    
    int id;
    String name;    
    Course course;

    public ArrayList<Integer> marks = new ArrayList<Integer>();

    
    public Student(int id, String name){
        this.id = id;
        this.name = name;

        marks.add(23);
        marks.add(34);
        marks.add(86);
        marks.add(69);
    }

    
    public void printDetails(){
        System.out.println("ID: " + this.id + "\nName: " + this.name);
        this.course.printDetails();
    }

    public void enroll(Course course){
        this.course = course;
    }
}
