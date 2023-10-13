public class Main{

    public static void main(String []args){

       //Task 1
       int age = Integer.parseInt(System.console().readLine("Enter your age: "));

       int yearBorn = 2023 - age;
       System.out.println("You were born in the year: " + yearBorn);
       if (age >= 18) {
        System.out.println("You are 18 or older");
        
       }


       
    }
}