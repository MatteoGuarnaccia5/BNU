public class Student {

    
    int id;
    String name;    
    Course course;

    
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    
    public void printDetails(){
        System.out.println("ID: " + this.id + "\nName: " + this.name);
        //Task 10
        this.course.printDetails();
    }

    public void enroll(Course course){
        this.course = course;
    }
}
