//Write a program to display all running threads in Java.

package Thr_Lab_11;
public class Running_Thread 
{
    public static void main(String[] args)
    {
        // Get all running threads
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        Thread[] threads = new Thread[threadGroup.activeCount()];
        threadGroup.enumerate(threads);

        // Display information about each thread
        System.out.println("Listing all running threads:");
        for (Thread thread : threads) 
        {
            System.out.println("Thread Name: " + thread.getName() +
                    "\nThread ID: " + thread.getId() +
                    "\nThread State: " + thread.getState() +
                    "\n---------------------");
        }
    }
}
