package Exception;

import java.util.Scanner;

public class Custome_Exception
{
	public static void main(String[] args) throws Pri_exp 
	{
		Custome_Exception obj=new Custome_Exception();		
			obj.use();
	}
	public void use() 
	{
		
		Scanner sc=new Scanner(System.in);
		int num;
		
		try
		{
			System.out.println("Enter You number");
			num=sc.nextInt();
			
			if(num%2==0)
			{
				evn_odd(num);
			}
			else
			{
				System.out.println("It is odd nUmber");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	public void evn_odd(int num) throws Pri_exp
	{
		throw new Pri_exp("It is Even Number");
	}
}
