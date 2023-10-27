public class Module{

    String name;
    String code;

    public Module(String name, String code){

        this.name = name;
        this.code = code;
    }
    //Task 8
    public String markToGrade(int mark){
        
        if (mark <= 34) {
            return "F";
        }
        else if (mark > 34 && mark <= 39){
            return "E";
        }
        else if (mark > 39 && mark <= 49){
            return "D";
        }
        else if (mark > 49 && mark <= 59){
            return "C";
        }
        else if (mark > 59 && mark <= 69){
            return "B";
        }
        else if (mark > 69 && mark <= 79){
            return "A";
        }
        else if (mark > 79 && mark <= 100){
            return "A+";
        }
        else{
            return "error";
        }
    }
}