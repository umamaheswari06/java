
import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        // if statement : performs a block of code if its condition is true

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age:");
         int age = scan.nextInt();

         scan.nextLine();
         System.out.print("Enter your name: ");
         String name = scan.nextLine();

         //GROUP 1
         if(name.isEmpty()){
            System.out.println("You didn't enter your name: ");
         }
         else{
            System.out.println("Hello " + name + "!");
         }



         //GROUP 2
        if (age >= 18 && age<=64){
            System.out.println("You are an adult!");
        }
        else if (age>=65){
            System.out.println("you are senior");
        }
        else if(age<0){
            System.out.println("you haven't born yet!");     
           }
           else if(age == 0){
            System.out.println("your a baby!");
           }
        else{
            System.out.println("Your are a child!");
        }
        scan.close();

    }
}