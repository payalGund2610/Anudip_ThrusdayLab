package Constructer;

import java.util.Scanner;

public class Parameterized_const
{
	// find greater between two numbers.
	public Parameterized_const(int num1,int num2)// create parameterize constructer
	{
		if(num1>num2)
		{
			System.out.println("num1 is grater"+num1);
		}
		else
		{
			System.out.println("num1 is grater"+num2);
		}
	}
	public static void main(String[] args)
	{
		accept();
	}
	public static void accept()
	{
		int num1,num2;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your two numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		new Parameterized_const(num1,num2);
	}

}
