import java.util.ArrayList;

public class ModuleMarks {
    
    //Task 11
    public int minMark = 100;
    public String minStudentName;

    public int maxMark = 0;
    public String maxStudentName;

    public int meanMark;
    public String meanStudentName;

    public int totalScore;
    public int count = 0;

    public ArrayList<Student> students = new ArrayList<Student>();

    public ModuleMarks(){

        students.add(new Student(1, "name1"));
        students.add(new Student(2, "name2"));
        students.add(new Student(3, "name3"));
        students.add(new Student(4, "name4"));
        students.add(new Student(5, "name5"));
    }

    //Task 11
    public void minMark(){

        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.get(i).marks.size(); j++) {

                if (students.get(i).marks.get(j) < minMark){
                    minMark = students.get(i).marks.get(j);
                    minStudentName = students.get(i).name;
                }
            }
        }
        System.out.println("The minimum mark and student name is as follows:\n");
        System.out.println("Student name: " + minStudentName + "\nMark: " + minMark);
    }

    public void maxMark(){

        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.get(i).marks.size(); j++) {

                if (students.get(i).marks.get(j) > minMark){
                    maxMark = students.get(i).marks.get(j);
                    maxStudentName = students.get(i).name;
                }
            }
        }
        System.out.println("The maximum mark and student name is as follows:\n");
        System.out.println("Student name: " + maxStudentName + "\nMark: " + maxMark);
    }

    public void meanMark(){

        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.get(i).marks.size(); j++) {

                count = count + 1;
                totalScore = totalScore + students.get(i).marks.get(j);
            }
        }
        System.out.println("\nThe mean mark and student name is as follows:\n");
        System.out.println("Mark: " + Math.round(totalScore/count));
    }


}
