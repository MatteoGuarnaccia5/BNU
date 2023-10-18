public class Course{

    String courseCode;
    String name;

    public Course(String code, String name){
        this.courseCode = code;
        this.name = name;
    }

    public void printDetails(){
        System.out.println("Code: " + this.courseCode + "\nName: " + this.name);
    }
}