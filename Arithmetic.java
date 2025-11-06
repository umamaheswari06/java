public class Arithmetic {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        
       int a = x+y;
        int b = x-y;
        int c = x*y;
        int d = x/y;
        int e = x%y;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

//augumented assignment operators
//x = x+y;
 x += y; // same for sub , div , mul , floor div ,  modulus
System.out.println(x);

// Increment and decrement operators
//x=x+1
x++;
y--;

System.out.println(x);
System.out.println(y);



// ORDER OF OPERATIONS [P-E-M-D-A-S]
double result =  3+4*(7-5) / 2.0;

System.out.println(result);
 }
}
