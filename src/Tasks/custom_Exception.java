package Tasks;

public class custom_Exception
{
    public static void main(String[] args)
    {
        System.out.println("---age 20---");
        try
        {
            validateAge(20);
        }
        catch (InvalidAgeException e)
        {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("\n---age 15---");
        try
        {
            validateAge(15);
        } catch (InvalidAgeException e)
        {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws InvalidAgeException
    {
        if (age < 18)
        {
            throw new InvalidAgeException("InvalidAgeException: Age must be 18 or older.");
        }
        else
        {
            System.out.println("Age " + age + " is valid.");
        }
    }
    public static class InvalidAgeException extends Exception
    {
        public InvalidAgeException(String message)
        {
            super(message);
        }
    } //

}
