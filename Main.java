public class Main{

    public static void main(String []args){

       //Task 6
       int age = Integer.parseInt(System.console().readLine("Enter your age: "));
       
       int yearBorn = 2023 - age;
       System.out.println("You were born in the year: " + yearBorn);
       
    }
}