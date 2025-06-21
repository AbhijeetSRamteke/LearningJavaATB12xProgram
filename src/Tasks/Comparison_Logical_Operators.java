package Tasks;

public class Comparison_Logical_Operators
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 5;

        // Equal to (==)
        boolean isEqual1 = (a == b);
        System.out.println(a + " == " + b + ": " + isEqual1);

        // Not equal to (!=)
        boolean isNotEqual = (a != b);
        System.out.println(a + " != " + b + ": " + isNotEqual);

        // Greater than (>)
        boolean isGreater = (a > b);
        System.out.println(a + " > " + b + ": " + isGreater);

        // Less than (<)
        boolean isLess = (a < b);
        System.out.println(a + " < " + b + ": " + isLess);

        // Greater than or equal to (>=)
        boolean isGreaterOrEqual1 = (a >= b);
        System.out.println(a + " >= " + b + ": " + isGreaterOrEqual1);

        // Less than or equal to (<=)
        boolean isLessOrEqual1 = (a <= b);
        System.out.println(a + " <= " + b + ": " + isLessOrEqual1);

        // --- Logical Operators ---

        // Logical AND (&&)
        boolean andResult1 = (a > b) && (a > 0);
        System.out.println(andResult1);

        boolean andResult2 = (a < b) && (a > 0);
        System.out.println(andResult2);

        // Logical OR (||)
        boolean orResult1 = (a < b) || (a > 0);
        System.out.println(orResult1);

        boolean orResult2 = (a > b) || (a < 0);
        System.out.println(orResult2);

        // Logical NOT (!)
        boolean notResult1 = !(a > b);
        System.out.println(notResult1);

        boolean notResult2 = !(a < b);
        System.out.println(notResult2);
    }
}
