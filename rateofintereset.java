//Write a program to accept age and gender from the user and check the ROI according to condition
//
//above 60
//M: 7%
//F: 7.5%
//
//below 60
//M,F: 5%

package conditional_statement;
import java.util.Scanner;
public class rateofintereset
{
	public static void main(String [] args)
	{
		int age;
		char gender;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the age:");
		age=sc.nextInt();
		System.out.println("enter the gender:");
		gender=sc.next().charAt(0);
		// for above 60 age rate of interest
		if(age>=60)
		{
			if(gender=='F')
			{
				System.out.println("Rate of intereset is 7%");
			}
			else if(gender=='M')
			{
				System.out.println("Rate of of interest is 7.5%");
			}
			else
			{
				System.out.println("inter proper gender");
			}
		}
		// for below 60 age rate of interest
		else if(age<60)
		{
			if(gender=='F' || gender=='f' || gender=='M' || gender=='m')
			{
				System.out.println("rate of interest is 5%");
			}
		}
		else
		{
				System.out.println("no rate of interest");
		}
	}
}


