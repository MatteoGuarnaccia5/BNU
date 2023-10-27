public class Main{

    public static void main(String[] args){
        
        
        Course course = new Course("909090090", "Digitech");
        course.printDetails();

        //Task 11
        ModuleMarks moduleMarks = new ModuleMarks();

        moduleMarks.minMark();
        moduleMarks.maxMark();
        moduleMarks.meanMark();
    }
    
}
