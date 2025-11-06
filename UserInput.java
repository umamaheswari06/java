/*import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {

        //STRING
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = scanner.nextLine();
         System.out.println("Hello " + name);

        //INT
        System.out.println("Enter your age :");
        int age = scanner.nextInt();
         System.out.println("Your are"  +  age  +  "years old");

        
         //DOUBLE
         System.out.println("Enter your GPA :");
        double GPA = scanner.nextDouble();
         System.out.println("Your gpa is :  " + GPA);

        
         //BOOLEAN
         System.out.println("are you a student? (true/false) :");
         boolean isStudent = scanner.nextBoolean();
         System.out.println("Student : " + isStudent);
         if(isStudent){
            System.out.println("your are enrolled as student");
         }
         else{
             System.out.println("your are  not enrolled as student");
         }
        scanner.close();
    }
}
*/
//COMMON ISSUE
// if int is next to the string we shouls use
// scanner.nextLine()

//calculate area of the rectangle

import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter the length : ");
         double length = scan.nextDouble();
         System.out.print("Enter the Breadth : ");
         double breadth = scan.nextDouble();
         double area = length * breadth;
         System.out.println("the area of the rectangle is : "  + area + "cm^2");
         scan.close();
    }
}