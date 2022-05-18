package basicJava_progressBar;

import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {

	int barMin = 0;
	int barMax = 200;
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(barMin, barMax);
	
	ProgressBarDemo(){
		
		bar.setValue(0);
		//set bounds because of the null layout manager
		bar.setBounds(0, 0, 350, 50);
		//show progress percentage
		bar.setStringPainted(true);
		bar.setFont(new Font("tahoma", Font.BOLD, 21));
		bar.setForeground(new Color(0xFF4E4E));
		bar.setBackground(new Color(0x000000));
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 350);
		frame.setLayout(null);
		frame.setVisible(true);
	
		fill();
	}
	
	public void fill() {
		int counter = barMax;
		while(counter > 0) {
			bar.setValue(counter);
			//pause program with 1000 millisecond after each loop
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter -=1;
		}
		bar.setString("Done!");
	}
}
