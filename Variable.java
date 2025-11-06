// variables  : a reusable container for a value
//              a variable behaves as if it was the value it containes 

// primitive : a simple value stored directly in memory(stack)
//reference  :  memory address (stack) that points to the (heap)

//primitive                       reference
//-------------------------------------------
// int                             string
//double                           array
//char                             object
//boolean

//2 steps in creating a variable
//1 : declaration 
//2 : assignment


//INT
class  Variable{
    public static void main(String[] args) {
       //INT 
       int age = 21;
       System.out.println(age);
       //DOUBLE
        double price = 19.99;
        System.out.println("$" + price);
        double temperature = -1.5;
        System.out.println(temperature);
       //CHAR
        char grade = 'A'; 
        System.out.println(grade);
        //BOOLEAN
        boolean isStudent = true;
        boolean forSale = false;
        System.out.println(isStudent);
        System.out.println(forSale);
        //STRING
        String name = "Phoenix";
        String food = "briyani";
        System.out.println("Hello" + name);
        System.out.println("your favourite food is " + food);
    }
}


