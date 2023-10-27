import java.util.ArrayList;

public class Course{

    String courseCode;
    String name;

    //Task 2
    ArrayList<Module> Modules;

    public Course(String code, String name){
        this.courseCode = code;
        this.name = name;

        
        //Task 2
        Modules.add(new Module("Programing Concepts", "94850948"));
        Modules.add(new Module("Work based learning", "66565566"));
        Modules.add(new Module("English", "44343423"));
        Modules.add(new Module("Maths", "48347857"));
    }

    public void printDetails(){
        System.out.println("Code: " + this.courseCode + "\nName: " + this.name);
    }
}