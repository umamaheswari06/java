
import java.util.Scanner;

public class If {
    public static void main(Strings[] args) {
        // if statement : performs a block of code if its condition is true

        try(Scanner scan = new Scanner(System.in)){
       /*  System.out.print("Enter your age:");
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
        }*/

        //nested if
        /*if(){
            if() {
                
            }
            else if() {
                
            }
            else{

            }
        }
            */
        System.out.print("Enter ticket base price: ");
        double price = scan.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scan.nextBoolean();

        System.out.print("Are you a senior citizen? (true/false): ");
        boolean isSenior = scan.nextBoolean();
            if(isStudent){
                if (isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a Student discount of 10%");
                price*=0.7;
                }
            else{
              System.out.println("You get a Student discount of 10%");
            price*=0.9;
            }
        }
        else{
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                price*=0.8;
            }
            else{
                price*=1;
            }
        }
        System.out.printf("the price of a ticket is : $%.2f" , price);
        scan.close();

    }
}
}
