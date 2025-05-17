package Tasks;

public class Task2_2_Max_Number
{
    public static void main(String[] args)
    {
        int a = 5, b = 7, c = 3;
        String max = a > b ? "max number is "+a : (b > c ? "max number is "+b : "max number is "+c);
        System.out.println(max);
    }

}
