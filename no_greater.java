//Write a program to accept choice from the user and perform the operation
//	1.Find out greater between 3 NO
//	2.Check given no is even or odd
//	3.Checkk the given character is vowel or not
//	4.check the given no is divible by 5 or not
package conditional_statement;
import java.util.Scanner;
public class no_greater 
{
	public static void main(String [] args)
	{
		int num1,num2,num3,ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("------MENU------");
		System.out.println("1.Find out greater between 3 NO"
				+ "2.Check given no is even or odd"
				+ "3.Checkk the given character is vowel or not"
				+ "4.check the given no is divible by 5 or not");
		System.out.println("Enter your choice:");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			//Find out greater between 3 NO
			System.out.println("Enter the value of num1:");
			num1=sc.nextInt();
			System.out.println("Enter the value of num2:");
			num2=sc.nextInt();
			System.out.println("Enter the value of num3:");
			num3=sc.nextInt();
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
			break;
		case 2:
			//Check given no is even or odd
			System.out.println("Enter the value of num1:");
			num1=sc.nextInt();
			if(num1%2==0)
			{
				System.out.println("num1 is even");
			}
			else
			{
				System.out.println("num is odd");
			}
			break;
		case 3:
			//Check the given character is vowel or not
			char vowel;
			System.out.println("enter vowels:");
			vowel=sc.next().charAt(0);
			if(vowel=='a' || vowel=='e' || vowel=='i' || vowel=='o' || vowel=='u')
			{
				System.out.println("it is vowel");
			}
			else
			{
				System.out.println("is not vowel");
			}
			break;
		case 4:
			//check the given no is divible by 5 or not
			System.out.println("Enter the value of num1:");
			num1=sc.nextInt();
			if(num1%3==0)
			{
				System.out.println("num1 is divisible by 3");
			}
			else
			{
				System.out.println("num1 is not divisible by 3");
			}
		}
	}
}
