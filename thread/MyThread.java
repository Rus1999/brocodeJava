package thread;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		
		if(this.isDaemon()) {
			System.out.println("thread2 is a daemon thread that is running");
		}
		else {
			System.out.println("This is a user thread that is running");
		}
	}
}
