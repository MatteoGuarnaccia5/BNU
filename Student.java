public class Student {

    
    int id;
    String name;
    //Task 8
    Course course;

    
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    
    public void printDetails(){
        System.out.println("ID: " + this.id + "\nName: " + this.name);
    }
}
