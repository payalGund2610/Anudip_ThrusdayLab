package thrusday_28_lab;

import java.util.Scanner;

public class Service_Center_Details extends Service_Center // Service_Center_Details class are extends parent class
{
	int carNo;
	String CarName;
	Scanner sc = new Scanner(System.in);
	@Override
	public void Accept_Details() // override abstract method
	{
		System.out.println("Enter Car Number:");
		carNo = sc.nextInt();
		super.setCarNo(carNo);
		
		System.out.println("Enter Car Name:");
		CarName = sc.next();
		
	}
	public void Display_Details()
	{
		System.out.println("Car Number: "+super.getCarNo());// supper keyword is use for call  getter method
		System.out.println("Car Name: "+CarName);	
	}	
}