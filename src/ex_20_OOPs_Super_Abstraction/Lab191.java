package ex_20_OOPs_Super_Abstraction;

public class Lab191
{
    public static void main(String[] args)
    {
        Abhijeet d = new Ramteke(); // Dynamic Dispatch will Interface
        Ramteke d1 = new Ramteke(); // Dynamic Dispatch will Interface
        d.display();
        System.out.println(d.a);
    }
}
class Ramteke implements Abhijeet
{
    @Override
    public void display()
    {
        System.out.println(a);
    }
}
interface Abhijeet
{
    int a = 10;
    void display();
}
