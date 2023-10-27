import java.util.ArrayList;

public class Course{

    String courseCode;
    String name;

    ArrayList<Module> Modules = new ArrayList<Module>();

    public Course(String code, String name){
        this.courseCode = code;
        this.name = name;

        Modules.add(new Module("Programing Concepts", "94850948"));
        Modules.add(new Module("Work based learning", "66565566"));
        Modules.add(new Module("English", "44343423"));
        Modules.add(new Module("Maths", "48347857"));
    }

    public void printDetails(){
    
        
        Student student = new Student(434324, "student");
        for (int i = 0; i < Modules.size(); i++) {
            System.out.println("The course name: " + Modules.get(i).name + "\nThe course code: " + Modules.get(i).code);
            System.out.println("Mark: " + student.marks.get(i));
        }
    }
}