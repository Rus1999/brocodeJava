package basicJava_multiThreading;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		//multithreading =	Process of executing multiple threads simultaneously
		//					Helps maximum utilization of CPU
		//					Threads are independent, they don't affect the execution of other threads.
		//					An exception in one thread will not interrupt other threads
		//					useful for serving multiple clients, multiplayer games, other mutually independent tasks
		
		
		//sub class of the Thread class
		MyThread thread1 = new MyThread();
		
		
		//implement Runnable interface and pass instance as an argument to Thread();
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
		
		//if no user thread is running JVM will terminate all daemon thread
		//thread1.setDaemon(true);
		//thread2.setDaemon(true);
		
		thread1.start();
		//calling thread (ex.main) wait until the specified thread dies or for x (ms)
		//thread1.join();
		thread2.start();
		
		//System.out.println(1/0);
	}

}
