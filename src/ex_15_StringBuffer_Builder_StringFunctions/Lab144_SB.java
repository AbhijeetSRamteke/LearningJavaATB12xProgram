package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_SB
{
    public static void main(String[] args)
    {
        StringBuffer stringBuffer = new StringBuffer("Abhijeet");
        stringBuffer.append("Ramteke");
        System.out.println(stringBuffer);

        String s1 = "Abhijeet";
        s1 = s1+ "Ramteke";
        System.out.println(s1);
    }
}
