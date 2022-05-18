package basicJava_simple2DAnimation;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	MyPanel panel;
	
	MyFrame(){
		
		panel = new MyPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		//center the window
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
