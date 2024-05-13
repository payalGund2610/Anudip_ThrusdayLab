package Synchronization;

import java.util.Scanner;

public class Consumer1 extends Thread
{
	Shop shop1;
	Scanner sc = new Scanner(System.in);
	public Consumer1(Shop shop)
	{
		this.shop1=shop;
	}
	public void run() 
	{
		int Kurkure1,Maggi1,Chocolate1;
		System.out.println("Enter Quantity of Kurkure=");
		Kurkure1 = sc.nextInt();
		System.out.println("Enter Quantity of Maggi=");
		Maggi1 = sc.nextInt();
		System.out.println("Enter Quantity of Chocolate=");
		Chocolate1 = sc.nextInt();
		
		shop1.Producer(Kurkure1, Maggi1, Chocolate1);
	}
}
