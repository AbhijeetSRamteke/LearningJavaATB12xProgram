package Tasks;

public class Increment_Decrement_Operators
{
    public static void main(String[] args)
    {
        // --- Pre-increment (++) ---
        int a = 5;
        System.out.println("Initial value of a: " + a);

        int b = ++a;
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

        // --- Post-increment (++) ---
        int x = 5;
        System.out.println("Initial value of x: " + x);

        int y = x++;
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);

        // --- Pre-decrement (--) ---
        int p = 5;
        System.out.println("Initial value of p: " + p);

        int q = --p;
        System.out.println("Value of p: " + p);
        System.out.println("Value of q: " + q);

        // --- Post-decrement (--) ---
        int m = 5;
        System.out.println("Initial value of m: " + m);

        int n = m--;
        System.out.println("Value of m: " + m);
        System.out.println("Value of n: " + n);

    }
}
