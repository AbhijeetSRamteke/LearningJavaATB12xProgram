package Tasks;

public class Task2_3_Adult_Minor_Senior
{
    public static void main(String[] args)
    {
        int age = 18;
        String result =  age >= 65  ? "I am Senior" : ((age > 18 && age<=65)? "I am an Adult" : "I am Minor");
        System.out.println(result);

    }
}
