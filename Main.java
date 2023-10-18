public class Main{

    public static void main(String[] args){
        
        Student student = new Student(1, "Matteo");
       //Task 11
       Course course = new Course("COM-4023", "Programming concepts");

       student.enroll(course);
       student.printDetails();
    }
    
}
