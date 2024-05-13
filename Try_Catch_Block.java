package Exception;

import java.util.Scanner;

public class Try_Catch_Block 
{
	public static void Demo()
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2,result;
		System.out.println("Enter Your Two Number:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		int array[] = {1,2,3,4};
		try 
		{
			result=num1+num2;
			System.out.println("Addition:"+result);
			result=num1-num2;
			System.out.println("Substraction:"+result);
			result=num1*num2;
			System.out.println("Multiplication:"+result);
			result=num1/num2;
			System.out.println("Division:"+result);
			result=num1%num2;
			System.out.println("Modulation:"+result);
			System.out.println(array[5]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae.getMessage());
		}
		catch(ArithmeticException ae)
		{
			System.out.println("the 2nd no. cannot be zero");
		}
		catch(Exception exp)
		{
			System.out.println("the 2nd no. cannot be zero");
		}
		finally
		{
			System.out.println("finally block");
		}
	}
	public static void main(String[] args)
	{
		Demo();
	}

}
