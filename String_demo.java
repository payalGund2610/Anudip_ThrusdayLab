package String;

import java.util.Scanner;

public class String_demo
{
	Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		String_demo obj = new String_demo();
		obj.literal();
		obj.String_new();
	}
	public void literal()
	{
		String name;
		System.out.println("Enter Your name:");
		name = sc .nextLine();
		System.out.println("Name: "+name);
	}
	public void String_new()
	{
		String add;
		System.out.println("Enter your address:");
		add = sc .nextLine();
		String add1 = new String();
		System.out.println("Address: "+add);
	}

}
