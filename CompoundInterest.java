//PROJECT1
                 // MADLIBS GAME

/*import java.util.Scanner;
public class Project1 {
    public static  void  main(String args[]){
        Scanner scan = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scan.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun1 = scan.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scan.nextLine();
        System.out.print("Enter a verb end with -ing(action): ");
        verb1 = scan.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scan.nextLine();

        System.out.println("\nToday I went to a "+ adjective1 + " zoo");
        System.out.println("Iam  an exhibit ,  I saw a " + noun1 +  ".");
        System.out.println(noun1 + " was " +  adjective2 + " and " + verb1  + "!");
        System.out.println("I was " + adjective3  + "!");

    }
    }
    */

//PROJECT2
           //SIMPLE INTREST CALCULATOR
           import java.util.Scanner;

public class CompoundInterest {  // ✅ not Math or MathJava
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double principle;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the Principal amount: ");
        principle = scan.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scan.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scan.nextInt();

        System.out.print("Enter the number of years: ");
        years = scan.nextInt();

        amount = principle * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.println("The amount after " + years + " is : $" + amount);

        scan.close();
    }
}
