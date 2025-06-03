package ex_09_Switch;

public class Lab094_JDK13
{
    public static void main(String[] args)
    {
        int itemcode = 001;
        switch (itemcode)
        {
            case 001,002,003:
                System.out.println("1 to 3");
                break;
            case 004,005,006:
                System.out.println("4 to 5");
                break;
            default:
                System.out.println("none");
        }
    }
}
