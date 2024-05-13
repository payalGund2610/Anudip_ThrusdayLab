//Write a program that creates 2 threads - each displaying a message 
//(Pass the message as a parameter to the constructor). 
//The threads should display the messages continuously till the user presses ctrl+c.

package Thr_Lab_4;

public class Message extends Thread
{
	        private String message;

	        public Message(String message) {
	            this.message = message;
	        }
	        @Override
	        public void run() {
	            try {
	                while (true) {
	                    System.out.println(message);
	                    Thread.sleep(1000); // Sleep for 1 second
	                }
	            } catch (InterruptedException e) {
	                // Handle interruption if needed
	            }
	        }
	    public static void main(String[] args) {
	        // Get messages from the user
	        String message1 = "Message from Thread 1";
	        String message2 = "Message from Thread 2";

	        // Create threads
	        Message thread1 = new Message(message1);
	        Message thread2 = new Message(message2);

	        // Start threads
	        thread1.start();
	        thread2.start();

	        // Register Ctrl+C hook
	        Runtime.getRuntime().addShutdownHook(new Thread(() -> 
	        {
	            // Interrupt threads on Ctrl+C
	            thread1.interrupt();
	            thread2.interrupt();
	            System.out.println("\nExiting program...");
	        }));

	        try {
	            // Keep the main thread running to capture Ctrl+C
	            while (true) {
	                Thread.sleep(1000); // Sleep for 1 second
	            }
	        } catch (InterruptedException e) {
	            // Handle interruption if needed
	        }
	    }
	}
