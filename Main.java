public class Main{

    public static void main(String []args){

        //Task 5
        int num = Integer.parseInt(System.console().readLine("Enter the times table you would like to see: "));

        for(int i=1; i<13; i++){
            System.out.println(i + " x " + num + " = " + (i*num));
        }
    }
}