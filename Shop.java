package Synchronization;

public class Shop 
{
	int kurkure=50,maggi=50,chocolate=10;
	synchronized void Producer(int value, int value1,int value2)
	{
		kurkure=kurkure-value;
		maggi=maggi-value1;
		chocolate=chocolate-value2;
		try 
		{
			Thread.sleep(6000);		
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Remaining Quantity of kurkure:"+kurkure);
		System.out.println("Remaining Quantity of maggi:"+maggi);
		System.out.println("Remaining Quantity of chocolate:"+chocolate);
	}
}
