package ex_24_Exceptions;

public class Lab209
{
    public static void main(String[] args)
    {
        int a = 0;
        int c = 0;
        try
        {
            c = 0/a;
        }
        catch (Throwable e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
