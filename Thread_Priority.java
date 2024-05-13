package Thr_Lab_11;

public class Thread_Priority extends Thread
{
	public void run()
	{
		System.out.println("Run method");
	}
	public static void main(String[] args) 
	{
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        Thread thread3 = new Thread();

        // Set priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Minimum priority
        thread2.setPriority(Thread.MAX_PRIORITY); // Maximum priority
        thread3.setPriority(3);
        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();
        
        System.out.println("Priority of thread1 is:"+thread1.getPriority());
        System.out.println("Priority of thread2 is:"+thread2.getPriority());
        System.out.println("Priority of thread3 is:"+thread3.getPriority());
        
    }
}


