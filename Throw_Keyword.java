package Exception;

public class Throw_Keyword 
{
//	public static void validate(int age)
//	{
//		if(age<24)
//		{
//			throw new ArithmeticException("not valid");
//		}
//		else
//		{
//			System.out.println("welcome to the club");
//		}
//	}
	public static void GRT(int num1,int num2)
	{
		if(num1==num2)
		{
			throw new ArrayIndexOutOfBoundsException("Both the no cannot be same");
		}
		else if(num1>num2)
		{
			System.out.println("Num1 is graeter"+num1);
		}
		else
		{
			System.out.println("Num2 is greater"+num2);
		}
	}
	public static void main(String[] args) 
	{
		//validate(20);
		GRT(2,2);
	}

}
