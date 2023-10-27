import java.util.ArrayList;
import java.util.Random;

public class Student {

    
    int id;
    String name;    
    Course course;

    public ArrayList<Integer> marks = new ArrayList<Integer>();

    
    public Student(int id, String name){

        Random rand = new Random();

        this.id = id;
        this.name = name;
        
        marks.add(rand.nextInt(101));
        marks.add(rand.nextInt(101));
        marks.add(rand.nextInt(101));
        marks.add(rand.nextInt(101));
    }

    
    public void printDetails(){
        System.out.println("ID: " + this.id + "\nName: " + this.name);
        this.course.printDetails();
    }

    public void enroll(Course course){
        this.course = course;
    }
}
