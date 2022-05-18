package basicJava_timerAndTimerTask;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
	public static void main(String[] args) {
		//Timer = A facility for threads to schedule tasks
		//		  for future execution in a background thread
		
		//TimerTask = A task that can be scheduled for one-time
		//			  or repeated execution by a Timer
	
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {

			int counter = 10;
			@Override
			public void run() {
				if(counter > 0) {
					System.out.println(counter+" seconds");
					counter--;
				}
				else {
					System.out.println("Happy New Year!");
					//stop the task
					timer.cancel();
				}
			}
			
			
		};

		//Delay triggered (ms)
		//timer.schedule(task, 1000);
		
		//Date triggered
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2022);
		date.set(Calendar.MONTH, Calendar.MAY);
		date.set(Calendar.DAY_OF_MONTH, 18);
		date.set(Calendar.HOUR, 11);
		date.set(Calendar.MINUTE, 32);
		date.set(Calendar.MILLISECOND, 0);
		//timer.schedule(task, date.getTime());
		
		//repeated task (task, delay(ms) for first triggered , repeated delay(ms)) 
		//timer.scheduleAtFixedRate(task, 0, 1000);
		
		timer.scheduleAtFixedRate(task, 0, 1000);
		
	}
}
