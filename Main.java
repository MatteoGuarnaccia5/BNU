public class Main{

    public static void main(String []args){

        //Task 6
        boolean Continue = true;

        do {
            int num = Integer.parseInt(System.console().readLine("Enter the times table you would like to see: "));

        for(int i=1; i<13; i++){
            System.out.println(i + " x " + num + " = " + (i*num));
        }
        
        String keepGoing = System.console().readLine("Do you want to keep going? (y/n)" );
        
        if(keepGoing.equals("n")){
            Continue = false;
        }
        if(keepGoing.equals("y")){
            Continue = true;
        }
        
        } while (Continue);
        
    }
}