package Tasks;

public class Task3_1_Output_for_INCREMENT
{
    public static void main(String[] args)
    {
        int i = 11;

        i = i++ + ++i;

        //i++ -> Exp -> 11 -> 12
        //+
        //++i -> Exp -> 13 -> 13

        System.out.println(i);
    }
}
