package Synchronization;

import java.util.Scanner;

public class Consumer extends Thread
{
	Shop shop;
	Scanner sc = new Scanner(System.in);
	public Consumer(Shop shop)
	{
		this.shop=shop;
	}
	public void run() 
	{
		int Kurkure,Maggi,Chocolate;
		System.out.println("Enter Quantity of Kurkure=");
		Kurkure = sc.nextInt();
		System.out.println("Enter Quantity of Maggi=");
		Maggi = sc.nextInt();
		System.out.println("Enter Quantity of Chocolate=");
		Chocolate = sc.nextInt();
		
		shop.Producer(Kurkure, Maggi, Chocolate);
	}
}
