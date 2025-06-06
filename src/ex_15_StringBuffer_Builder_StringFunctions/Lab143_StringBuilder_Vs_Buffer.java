package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab143_StringBuilder_Vs_Buffer
{
    public static void main(String[] args)
    {
// String - 90%
        String s0 = "Abhijeet";
        String s1 = new String("Abhijeet");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Abhijeet");
        StringBuilder stringBuilder = new StringBuilder("Abhijeet");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());

    }
}
