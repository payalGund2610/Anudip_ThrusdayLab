package String;

import java.util.Scanner;

public class Method_call 
{
	public static void main(String[] args) 
	{
		int choice;
		String_Methods obj = new String_Methods();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("##---##---##---MENU---##---##---##");
			System.out.println("1.Char_At()\n"+"2.Compare_to()\n"+"3.Concat()\n"+"4.Ends_with()\n"+"5.Equals()"+"6.Is_Empty()\n"
			+"7.Length()\n"+"8.To_Lower_Case()\n"+"9.To_Upper_Case()\n"+"10.Trim()\n"+"11.IndexOf()");		
			System.out.println("Enter Your Choice:");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				obj.Char_At();
				break;
			case 2:
				obj.Compare_to();
				break;
			case 3:
				obj.Concat();
				break;
			case 4:
				obj.Ends_with();
				break;
			case 5:
				obj.Equals();
				break;
			case 6:
				obj.Is_Empty();
				break;
			case 7:
				obj.Length();
				break;
			case 8:
				obj.To_Lower_Case();
				break;
			case 9:
				obj.To_Upper_Case();
				break;
			case 10:
				obj.Trim();
				break;
			case 11:
				obj.IndexOf();
				break;
			default:
				System.out.println("Enter Valid choice only");
			}
			System.out.println("Do you have more Choice");
			choice= sc.next().charAt(0);
		}while(choice=='y' || choice=='Y');
	}
}
