public class Main{

    public static void main(String []args){

        String grade = System.console().readLine("Enter your grade: ");

        if (grade.toUpperCase().equals("A")) {
            System.out.println("The equivalent University classification is: 1st");
        }
        else if (grade.toUpperCase().equals("B")) {
            System.out.println("The equivalent University classification is: 2:1");
        }
        else if (grade.toUpperCase().equals("C")) {
            System.out.println("The equivalent University classification is: 2:2");
        }
        else if (grade.toUpperCase().equals("D")) {
            System.out.println("The equivalent University classification is: 3rd");
        }
        else if (grade.toUpperCase().equals("E")) {
           System.out.println("The equivalent University classification is: ordinary");
        }
        else if (grade.toUpperCase().equals("F")) {
           System.out.println("The equivalent University classification is: fail");
        }
        else{
            System.out.println("Non valid grade entered");
        }

        
    }
}