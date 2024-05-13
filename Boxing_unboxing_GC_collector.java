//WAP to accept choice from user and execute the process
//1:Boxing
//2:Unboxing
//3:Garbage collection
//
//(Here you need to implement the process by your own  )
package Garbej_colector;

import java.util.Scanner;

public class Boxing_unboxing_GC_collector 
{
	static int num1;
	public static void Boxing()
	{
		Integer a2= new Integer(num1);
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int choice = 0;
		do
		{
			System.out.println("1:Boxing\n2:Unboxing\n3:Garbage collection");
			System.out.println("Enter Your Choice:");
			choice= sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter Your Number:");
					num1=sc.nextInt();
					Boxing();
					break;
				case 2:
					break;
				case 3:
					break;
				default:
					System.out.println("Enter Valid Choice Only");
			}
			System.out.println("Do you want add another choices Y/N");
			choice=sc.next().charAt(0);
		}while(choice=='y' || choice=='Y');
	}

}
