public class Module{

    String name;
    String code;

    //Task 9
    enum Grade {
        A,
        B,
        C,
        D,
        E,
        F,
        U
    }

    public Module(String name, String code){

        this.name = name;
        this.code = code;
    }
    //Task 9
    public Grade markToGrade(int mark){
        
        if (mark <= 34) {
            return Grade.U;
        }
        else if (mark > 34 && mark <= 39){
            return Grade.F;
        }
        else if (mark > 39 && mark <= 49){
            return Grade.E;
        }
        else if (mark > 49 && mark <= 59){
            return Grade.D;
        }
        else if (mark > 59 && mark <= 69){
            return Grade.C;
        }
        else if (mark > 69 && mark <= 79){
            return Grade.B;
        }
        else if (mark > 79 && mark <= 100){
            return Grade.A;
        }
        else{
            return Grade.U;
        }
    }
}