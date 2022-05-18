package basicJava_thread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * thread =	A thread of execution in a program (kind of like a virtual CPU)
		 * 			The JVM allows an application to have multiple threads running concurrently
		 * 			Each thread can execute parts of you code in parallel with the main thread
		 * 			Each thread has a priority.
		 * 			Threads with higher priority are executed in preference compared to threads	with a lower priority
		 * 
		 * 			The Java Virtual Machine continues to execute threads until either of the following occurs
		 * 				1.The exit method of class Runtime has been called
		 * 				2.All user threads have died
		 * 			
		 * 			When a JVM starts up, there is a thread which calls the main method 
		 * 			This thread is called "main"
		 * 
		 * 			Daemon thread is a low priority thread that runs in background to performs tasks such as garbage collection
		 *			JVM terminates itself when all user threads (non-daemon threads) finish their execution
		 */
		
		//return how many thread are active
		//System.out.println(Thread.activeCount());
		
		//return name of the current thread
		//System.out.println(Thread.currentThread().getName());
	
		//Thread.currentThread().setName("CusttomThread Name");
		//System.out.println(Thread.currentThread().getName());
		
		//setPriority (1-10)
		//Thread.currentThread().setPriority(10);
		
		//Priority range between 1 and 10 higher the priority the higher priority for the thread
		//System.out.println(Thread.currentThread().getPriority());
	
		//check Thread is alive
		//System.out.println(Thread.currentThread().isAlive());
	
		
		
		
		/*
		for(int i=3; i>0; i--) {
			System.out.println(i);
			//put thread to sleep for (ms)
			Thread.sleep(1000);
		}
		
		System.out.println("Completed!");
		*/
		
		
		
		/* create the thread */
		MyThread thread2 = new MyThread();
		
		thread2.setDaemon(false);
		System.out.println(thread2.isDaemon());
		
		//start the thread
		thread2.start();

		//System.out.println(Thread.activeCount());
		
		//System.out.println(thread2.isAlive());
		//thread2.setName("2nd thread");
		//System.out.println(thread2.getName());
		//thread2.setPriority(5);
		
		//inherited the priority of the parent thread
		//System.out.println(thread2.getPriority());

		
		
		
	}

}
