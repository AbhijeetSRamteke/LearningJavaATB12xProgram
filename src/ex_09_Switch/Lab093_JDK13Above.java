package ex_09_Switch;

public class Lab093_JDK13Above
{
    public static void main(String[] args)
    {
        int itemCode = 007;
        switch (itemCode)
        {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            default -> System.out.println("Default");
        }
    }
}
