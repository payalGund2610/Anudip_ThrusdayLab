package Thr_Lab_11;

class Consumer implements Runnable 
{
    private SharedBuffer sharedBuffer;

    public Consumer(SharedBuffer sharedBuffer) 
    {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() 
    {
        for (int i = 1; i <= 10; i++) 
        {
            sharedBuffer.consume();
        }
    }
}
