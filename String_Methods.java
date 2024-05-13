package String;

import java.util.Scanner;

public class String_Methods
{
	String str,str1;
	Scanner sc = new Scanner(System.in);
	public void Sring_Accept()
	{
		System.out.println("Enter Your String: ");
		str = sc.nextLine();
	}
	public void Char_At()
	{
		System.out.println("----CharAt----");
		Sring_Accept();
		System.out.println(str.charAt(1));
	}
	public void Compare_to()
	{
		System.out.println("------CompareTo------");
		Sring_Accept();
		System.out.println("Enter Your String:");
		str1= sc .nextLine();
		if(str.compareTo(str1)==0)
		{
			System.out.println("String are Equals");
		}
		else
		{
			System.out.println("string Are Not Equals");
		}
	}
	public void Concat()
	{
		System.out.println("----- Concat------");
		Sring_Accept();
		System.out.println("Enter Your String:");
		str1= sc.nextLine();
		System.out.println("Full String is:"+str.concat(str1));
	}
	public void Ends_with()
	{
		System.out.println("-----EndsWith-----");
		Sring_Accept();
		if(str.endsWith("al"))
		{
			System.out.println(str + " are Ends with al");
		}
		else
		{
			System.out.println(str + " are not Ends With al");
		}
	}
	public void Equals()
	{
		System.out.println("------ Equals ------");
		Sring_Accept();
		System.out.println("Enter Your String:");
		str1 = sc.nextLine();
		if(str.equals(str1))
		{
			System.out.println(str + " is equals with "+ str1);
		}
		else
		{
			System.out.println(str + " is not-equals with "+ str1);
		}
	}
	public void Is_Empty()
	{
		System.out.println("----IsEmpty----");
		Sring_Accept();
		if(str.isEmpty())
		{
			System.out.println("String is Empty");
		}
		else
		{
			System.out.println("String is not Empty");
		}
	}
	public void Length()
	{
		System.out.println("--- Length----");
		Sring_Accept();
		System.out.println("String length is:"+str.length());
	}
	public void To_Lower_Case()
	{
		System.out.println("------ToLowerCase-----");
		Sring_Accept();
		System.out.println("String in Lower Case:"+str.toLowerCase());
	}
	public void To_Upper_Case()
	{
		System.out.println("------ToUpperCase-----");
		Sring_Accept();
		System.out.println("String in upper Case:"+str.toUpperCase());
	}
	public void Trim()
	{
		System.out.println("----Trim----");
		Sring_Accept();
		System.out.println("After Removing Whitespace String Is:"+str.trim());
	}
	public void IndexOf()
	{
		System.out.println("-----Index Of-----");
		Sring_Accept();
		System.out.println("Enter Small String:");
		str1 = sc.nextLine();
		System.out.println("String at the position of:"+str.indexOf(str1));
	}
}
