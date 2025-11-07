/*import java.util.Random;
public class Compound {
    public static void main(String[] args) {
        Random random = new Random();

        //INT
        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1 , 101);
        number2 = random.nextInt(1 , 101);
        number3 = random.nextInt(1 , 101);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        

        //DOUBLE
        double number;
        number = random.nextDouble();
        System.out.println(number);

        //BOOLEAN
        boolean isHeads;
        isHeads = random.nextBoolean();
        System.out.println(isHeads);
    }
}
*/


//MATH  METHODS

//Math.pi (pi)
//Math.E (exponent)
//Math.pow (power)
//Math.abs (absolute value)
//Math.sqrt (square root)
//Math.round (round value)
//Math.ceil
//Math.floor
//Math.max (maximum)
//Math.min (minimum)

import java.util.Scanner;
public class Math {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       // EX : 1  HYPOTENUSE OF THE RIGHT ANGLED TRIANGLE 
       /*  System.out.print("Enter the value of a: ");
        double a  = scan.nextDouble();
        System.out.print("Enter the value of b: ");
        double b  = scan.nextDouble();

        //double c =Math.sqrt(a*a + b*b);
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("the hypotenuse of right angled triangle " + c);
*/

        //EX : 2 

        //circunference = 2*Math.pi * radius;
        //area = Math.pi * Math.pow(radius, 2);
        //volume = (4.0/3.0) * Math.pi * Math.pow(radius, 3);

        /*  double radius ;
         double  circumference;
         double area;
         double volume;

         System.out.print("Enter the radius: ");
         radius = scan.nextDouble();

         circumference = 2*Math.PI * radius;
         area = Math.PI * Math.pow(radius, 2);
         volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

         System.out.printf("\nCircumference is : %.2f" , circumference);
         System.out.printf("\nArea is : %.2f " , area);
         System.out.printf("\nVolume is : %.2f " , volume);

         */


         //Printf --> is a method used to format output
         // %[flags] [width] [.precision] [specifier-character]

         //specifier-character
        String name = "phoenix";
         char firstletter = 'p';
         int age = 19;
         double height = 60.5;
         boolean isEmployed = true;

        System.out.printf("Hello %s\n" , name);
        System.out.printf("Your name starts with a %c\n" , firstletter);
        System.out.printf("Hello phoenix Your are  %d years old\n", age);
        System.out.printf("Your height is %f inches tall\n" , height);
        System.out.printf("Are you employed : %b\n" , isEmployed);

        System.out.printf("%s is %d years old with the height of %f" , name,age,height);

        //FLAGS
        double price1 =9000.99;
        double price2 = -540000.01;
        //+ = output a plus
        System.out.printf("%+.2f\n",price1);
        System.out.printf("%+.2f\n",price2);

        //, = comma grouping seperator
        System.out.printf("%,.2f\n",price1);
        System.out.printf("%,.2f\n",price2);

        //( = negative numbers are enclosed in ()
        System.out.printf("%(.2f\n",price1);
        System.out.printf("%(.2f\n",price2);

        // space = display a minus if negative , space if positive 
        System.out.printf("% .2f\n",price1);
        System.out.printf("% .2f\n",price2);


        //WIDTH

        //0 = zero padding
        // number = right justified padding
        //negative number = left justified padding


        int a = 1;
        int b = 12;
        int c = 123;
        int d = 1234;

         //0 = zero padding
        System.out.printf("%04d\n" , a);
        System.out.printf("%04d\n" , b);
        System.out.printf("%04d\n" , c);
        System.out.printf("%04d\n" , d);


         // number = right justified padding
        System.out.printf("%4d\n" , a);
        System.out.printf("%4d\n" , b);
        System.out.printf("%4d\n" , c);
        System.out.printf("%4d\n" , d);

          //negative number = left justified padding
        System.out.printf("%-4d\n" , a);
        System.out.printf("%-4d\n" , b);
        System.out.printf("%-4d\n" , c);
        System.out.printf("%-4d\n" , d);

        scan.close();
    }
}