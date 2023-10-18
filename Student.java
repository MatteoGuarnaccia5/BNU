public class Student {

    
    int id;
    String name;

    
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    
    public void printDetails(){
        System.out.println("ID: " + this.id + "\nName: " + this.name);
    }
}
