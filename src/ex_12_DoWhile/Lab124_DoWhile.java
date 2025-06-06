package ex_12_DoWhile;

public class Lab124_DoWhile
{
    public static void main(String[] args)
    {
        int a = 1;
        do                               // print 1 to 9
        {
            System.out.println("body");
            System.out.println(a);
            a++;
        }
        while(a < 10);
    }
}
