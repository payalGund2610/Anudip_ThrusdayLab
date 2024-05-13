package Ploymorphism_overloading;
import java.util.Scanner;
public class Bank_ROI 
{
	public static void main(String[] args) 
	{
		Bank_ROI obj=new Bank_ROI();
		obj.my_acc_ROI();
	}
	public void my_acc_ROI()
	{
		int amount,choice,final_amount,int_amount,r = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1.RBI\n 2.Saving \n 3:Current");
		System.out.println("Enter Your Choice:");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			r=ROI();
			break;
		case 2: 
			System.out.println("enter your age");
			int age=sc.nextInt();
			r=ROI(choice,age);
			break;
		case 3:
			r=ROI(choice);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		System.out.println("enter your amount");
		amount = sc.nextInt();
		int_amount=(amount/100)*r;
		final_amount=int_amount+amount;
		System.out.println("your final balance");
		sc.close();
	}
	public int ROI()
	{		
		System.out.println("8% ROI");
		return 8;
	}
	public int ROI(int ch)
	{
		System.out.println("6%ROI");
		return 6;
	}
	public int ROI(int ch, int age)
	{
		int ri;
		if(age>=60)
		{
			ri=5;
		}
		else
		{
			ri=4;
		}
		return ri;
	}
}
