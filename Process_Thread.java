package Multithreading;
// Multi threading
public class Process_Thread extends Thread
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
		
		Process_Thread obj1 = new Process_Thread();
		obj1.start();
		
		Process_Thread obj2 = new Process_Thread();
		obj2.start();
		
		Process_Thread obj3 = new Process_Thread();
		obj3.start();
	}
}
