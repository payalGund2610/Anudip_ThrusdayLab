package Exception;

import java.util.Scanner;

public class Operator 
{
	public void Demo()
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2,result;
		System.out.println("Enter Your Two Number:");
		num1=sc.nextInt();
		num2=sc.nextInt();
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
		sc.close();
	}
	public static void main(String[] args)
	{
		Operator o = new Operator();
		o.Demo();
	}

}
