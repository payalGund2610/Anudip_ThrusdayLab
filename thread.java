package Multithreading;
// threading
public class thread 
{

	public void run()
	{
		int i;
		for (i=1;i<=10;i++)
		{
			System.out.println("num="+i);
		}
	}
	public static void main(String[] args)
	{
		Process_Thread obj = new Process_Thread();
		obj.start();
	}

}
