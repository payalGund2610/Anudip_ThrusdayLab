package Thr_Lab_11;

public class Producer implements Runnable 
{
	    private SharedBuffer sharedBuffer;

	    public Producer(SharedBuffer sharedBuffer)
	    {
	        this.sharedBuffer = sharedBuffer;
	    }

	    public void run() 
	    {
	        for (int i = 1; i <= 10; i++) 
	        {
	            sharedBuffer.produce(i);
	        }
	    }
}

