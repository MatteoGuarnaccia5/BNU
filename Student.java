public class Student {

    //Task 1
    int id;
    String name;

    //Task 2
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    //Task 3
    public void printDetails(){
        System.out.println("ID: " + this.id + "\nName: " + this.name);
    }
}
