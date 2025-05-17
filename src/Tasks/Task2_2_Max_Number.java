package Tasks;

public class Task2_2_Max_Number
{
    public static void main(String[] args)
    {
        int N1 = 11, N2 = 12, N3 = 13;
        String max = (N1>N2 && N1>N3) ? "Max number is "+N1 : (N2>N3 ? "Max number is "+N2 : "Max number is "+N3);
        System.out.println(max);
    }

}
