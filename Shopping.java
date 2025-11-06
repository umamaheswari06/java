import java.util.Scanner;
public class Shopping {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scan.nextLine();

        System.out.print("What is the price of each?: ");
        price = scan.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scan.nextInt();

        total = price*quantity;
        System.out.println( "\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);
        scan.close();
    }
}
