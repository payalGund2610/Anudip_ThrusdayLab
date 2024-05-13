package Synchronization;

public class MainClass 
{

	public static void main(String[] args) 
	{
		Shop s = new Shop();
		Shop s1 = new Shop();
		Shop s2 = new Shop();
		Consumer1 c1 = new Consumer1(s);
		Consumer1 c2 = new Consumer1(s1);
		Consumer1 c3 = new Consumer1(s2);

		c1.start();
		c2.start();
		c3.start();
	}

}
