package thrusday_28_lab;

import java.util.Scanner;

public class Customer_details extends Customer //Customer_details extends Customer 
{
	int Cus_Adhar_no,Cus_Phone_no;
	String Cus_Name,Cus_Password,Cus_Password1,Cus_Name1;
	boolean flag=true; //  set flag true
	public void CarOwner() // method of CarOwner
	{
			int choice = 0;
			System.out.println("1: Register \n2: Login");
			do 
			{
				System.out.println("Are you new customer ? Y/N ");
				System.out.println("then you can register first and then you can login and come to my serivice center");
				choice=sc.next().charAt(0);
				break;
			}while(choice=='Y' || choice=='y');
			
			if(choice=='y' || choice=='Y')  //if else condition is used for registration and login
			{
				System.out.println("for Registeration");
				Accept_Details();			// call Accept_Details method
				Display(Cus_Name);
				System.out.println("for Login");
				Accept();
				Display(Cus_Name,Cus_Phone_no);
			}
			else
			{
				System.out.println("for Login");
				Accept_Details_Login();
				Display(Cus_Name,Cus_Phone_no);
			}
	}
	Scanner sc = new Scanner(System.in);
	Customer obj1 = new Customer();
	public void Accept_Details() //this is Accept_Details method is use for accepting details of customer 
	{
		
		System.out.println("Enter Customer Adhar Number:");
		Cus_Adhar_no = sc. nextInt();
		obj1.setCus_Adhar_no(Cus_Adhar_no);
		
		System.out.println("Enter Customer Phone Number:");
		Cus_Phone_no = sc. nextInt();
		
		System.out.println("Enter Customer Name:");
		Cus_Name = sc.next();
		
		System.out.println("Enter Customer Paasword:");
		Cus_Password = sc.next();
		obj1.setCus_Password(Cus_Password);		
	}
	public void Accept() // method of details accept of customer for registration
	{
		do
		{
			System.out.println("Enter Customer Name:");
			Cus_Name1 = sc.next();
			if(Cus_Name1.equals(Cus_Name))
			{
				System.out.println("Enter Customer Paasword:");
				Cus_Password1 = sc.next();
				if(Cus_Password1.equals(Cus_Password))	// equals method are use for comparing strings
				{
					flag=false;
					obj1.setCus_Password(Cus_Password);
				}	
				else
				{
					flag=true;
					System.out.println("Enter valid password");
				}
			}	
			else
				System.out.println("Enter valid name");
		}while(flag);
	}
	public void Accept_Details_Login() 	// Accept_Details_Login() method is use for accept details for login
	{
		System.out.println("Enter Customer Name:");
		Cus_Name = sc.next();
		
		System.out.println("Enter Customer Paasword:");
		Cus_Password = sc.next();
		obj1.setCus_Password(Cus_Password);		
	}
	
	public void Display(String Cus_Name,int Cus_Phone_no)// this method if use for Display Details of login
	{
		System.out.println("Name: "+Cus_Name);
		System.out.println("Password: ***********");
	}
	public void Display(String Cus_Name) //  this method if use for Display Details of Registration
	{	
		System.out.println("Name: "+Cus_Name);
		System.out.println("Adhar Number: "+obj1.getCus_Adhar_no());
		System.out.println("Phone No:"+Cus_Phone_no);
		System.out.println("Password: **********");
	}
}
