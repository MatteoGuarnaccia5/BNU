public class Main{

    public static void main(String []args){

       //Task 4
       double num1 = Double.parseDouble(System.console().readLine("Enter first number: "));
       double num2 = Double.parseDouble(System.console().readLine("Enter second number: "));

       double average = (num1 + num2)/2;

       System.out.println("The average of the 2 numbers is: " + average);
    }
}