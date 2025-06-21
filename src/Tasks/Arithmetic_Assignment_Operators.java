package Tasks;

public class Arithmetic_Assignment_Operators
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 5;

        // Addition (+)
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // Subtraction (-)
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // Multiplication (*)
        int multiply = a * b;
        System.out.println("a * b = " + multiply);

        // Division (/)
        int Div = a / b;
        System.out.println("a / b = " + Div);

        // Modulus (%)
        int remainder = a % b;
        System.out.println("a % b = " + remainder);

        // Division with double to get precise result
        double x = 10.0;
        double y = 3.0;
        double doubleq = x / y;
        System.out.println("x / y (double) = " + doubleq);


        //Assigment Operators
        int c = 20;
        System.out.println("Initial value of c: " + c);

        // Simple Assignment (=)
        int d = 50;
        System.out.println("Initial value of d: " + d);

        // Add and Assign (+=)
        c += 5;
        System.out.println("c after c += 5: " + c);

        // Subtract and Assign (-=)
        c -= 10;
        System.out.println("c after c -= 10: " + c);

        // Multiply and Assign (*=)
        c *= 2;
        System.out.println("c after c *= 2: " + c);

        // Divide and Assign (/=)
        c /= 6;
        System.out.println("c after c /= 6: " + c);

        // Modulus and Assign (%=)
        d %= 7;
        System.out.println("d after d %= 7: " + d);
    }
}
