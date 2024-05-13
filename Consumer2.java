package Synchronization;

import java.util.Scanner;

public class Consumer2 
{
	Shop shop2;
	Scanner sc = new Scanner(System.in);
	public Consumer2(Shop shop)
	{
		this.shop2=shop;
	}
	public void run() 
	{
		int Kurkure2,Maggi2,Chocolate2;
		System.out.println("Enter Quantity of Kurkure=");
		Kurkure2 = sc.nextInt();
		System.out.println("Enter Quantity of Maggi=");
		Maggi2 = sc.nextInt();
		System.out.println("Enter Quantity of Chocolate=");
		Chocolate2 = sc.nextInt();
		
		shop2.Producer(Kurkure2, Maggi2, Chocolate2);
	}
}
