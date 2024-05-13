//Write a JAVA program which will generate the threads:
//
//1- To display 20 terms of Fibonacci series.
//
//- To display 1 to 9999 in reverse order.

package Thr_Lab_4;

import java.util.Scanner;

public class Febbonassi extends Thread
{
	
	public void Menu_All() // all menu method
	{
		Scanner sc = new Scanner(System.in);
		int Choice;
		do {
		System.out.println("----------MENU-----------");
		System.out.println("1:Thread\n2:Febonassi_Series\n3:Reverse_Order");
		System.out.println("Enter Your Choice:");
		Choice=sc.nextInt();
		switch(Choice)// use switch case
		{
			case 1:
				Febbonassi obj = new Febbonassi();
				obj.start(); 
				break;
			case 2:
				Febonassi_Series();
				break;
			case 3:
				Reverse_Order();
				break;
		}
		System.out.println("Do You want more choice");
		Choice=sc.next().charAt(0);
		}while(Choice=='Y' || Choice=='y');
		sc.close();
	}
	public void run()// this is in built thread method
	{
		int i;
		for (i=1;i<=10;i++)
		{
			System.out.println("num="+i);
		}
	}
	public void Febonassi_Series()// for febonassi series
	{
		int FirstNumber=0,SecondNumber=1,NextNumber,i;  // declare and initialize variable
		System.out.println(FirstNumber);
		System.out.println(SecondNumber);
		for(i=3;i<21;i++)
		{
			NextNumber=FirstNumber+SecondNumber;
			System.out.println(FirstNumber+"+"+SecondNumber+"="+NextNumber);
			FirstNumber=SecondNumber;
			SecondNumber=NextNumber;			
		}
	}
	public void Reverse_Order() // for 1 to 9999 numbers in Reverse_Order
	{
		int i;
		for(i=9999;i>=1;i--)
		{
			System.out.println(i);
		}
		System.out.println();
	}
	public static void main(String[] args) // this is main function
	{
		Febbonassi obj1 = new Febbonassi();
		obj1.Menu_All();
	}
}
