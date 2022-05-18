package basicJava_paint2dGraphic;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	MyPanel panel;
	
	MyFrame(){
		
		panel = new MyPanel();
		
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set frame to appear on center of the screen when lunched
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	

}
