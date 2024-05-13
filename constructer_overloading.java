package Constructer;

import java.util.Scanner;

public class constructer_overloading 
{
	static int num;
	constructer_overloading()
	{
		int rem,sum=0;
		while(num>0)
		{
			rem=num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println("sum of digit"+num);
	}
	constructer_overloading(int num4)
	{
		if(num4 % 2==0) 
		{
			System.out.println("number is even"+num4);
		}
		else
		{
			System.out.println("number is odd"+num4);
		}
	}
	constructer_overloading(int num1,int num2,int num3)
	{
		if(num1>=num2 && num1>=num3)
		{
			System.out.println("num1 is grater");
		}				
		else if(num2>=num1 && num2>=num3)
		{
			System.out.println("num2 is greater");	
		}
		else if(num3>=num1 && num3>=num2)
		{
			System.out.println("num3 is grater");
		}
	}
	public static void main(String[] args) 
	{
		accept();
	}
	public static void accept()
	{
		int num1,num2,num3,num4,choice;
		Scanner sc= new Scanner(System.in);
		System.out.println("1:sum of digit\n 2:even odd\n3:Greater between three");
		choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("enter a number:");
			num=sc.nextInt();
			new constructer_overloading();
		}
		else if(choice==2)
		{
			System.out.println("enter a number:");
			num4=sc.nextInt();
			new constructer_overloading(num4);
		}
		else
		{
			System.out.println("enter a number:");
			num1=sc.nextInt();
			System.out.println("enter a number:");
			num2=sc.nextInt();
			System.out.println("enter a number:");
			num3=sc.nextInt();
			new constructer_overloading(num1,num2,num3 );
		}
			
	}
}


















