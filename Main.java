public class Main{

    public static void main(String []args){

       //Task 3
       int length = Integer.parseInt(System.console().readLine("Enter length: "));
       int height = Integer.parseInt(System.console().readLine("Enter height: "));

       int area = length * height;
       int perimeter = (length + height) * 2;

       System.out.println("The area of the rectangle is " + area);
       System.out.println("The perimeter of the rectangle is " + perimeter);
    }
}