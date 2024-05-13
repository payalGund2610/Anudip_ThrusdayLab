package Exception;

public class Throws_Keyword 
{
	public static void use_Demo()
	{
		try
		{
		demo();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void demo() throws ArithmeticException
	{
			validate(22);	
	}
	public static void validate(int age) 
	{
		if(age<24)
		{
		throw new ArithmeticException("not valid");
		}
		else
		{
		System.out.println("welcome to the club");
		}
	}
	public static void main(String[] args)
	{
		use_Demo();
	}
}
