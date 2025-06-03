package ex_10_For_Loop;

public class Lab098_For_Loop
{
    public static void main(String[] args)
    {
        // For Loop
        // Help you to repeat a block of code.
        // Initialization -> Condition -> Updation(Incre/decre)
        // ICU

        for (int i=0; i<10; i++)  //print 0 to 9
        {
            System.out.println(i);
        }
        System.out.println("-----------------------");
        for (int i=1; i<=10; i++)  //print 1 to 10
        {
            System.out.println(i);
        }
        System.out.println("-----------------------");
        for (int i=10; i>0; i--)   //print 10 to 1
        {
            System.out.println(i);
        }
        System.out.println("-----------------------");
        for (int i=10; i>=0; i--)  //print 10 to 0
        {
            System.out.println(i);
        }
    }
}
