public class Main{

    public static String grade;
    public static void main(String []args){

        //Task 7
        int mark = Integer.parseInt(System.console().readLine("Enter mark: "));
        

        if (mark >= 0 && mark<20) {
            grade = "U";
        }
        if (mark >=20 && mark < 30) {
            grade = "E";
        }
        if (mark >= 30 && mark<45) {
            grade = "D";
        }
        if (mark >=45 && mark < 55) {
            grade = "C";
        }
        if (mark >= 55 && mark<65) {
            grade = "B";
        }
        if (mark >=65 && mark < 75) {
            grade = "A";
        }
        if (mark >= 75) {
            grade = "A*";
        }
        
        
        System.out.println(grade);
    }
}