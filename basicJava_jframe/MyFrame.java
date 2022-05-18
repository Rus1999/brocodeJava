package basicJava_jframe;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MyFrame() {
		this.setTitle("WowZaa");//set title of the this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit application
		this.setResizable(false);//prevent this from resized
		this.setVisible(true);//make this visible
		this.setSize(420,420);//set size x,y
		
		ImageIcon image = new ImageIcon("th.jpg");//crate an image icon
		this.setIconImage(image.getImage());//change icon of the this
		this.getContentPane().setBackground(new Color(0xFF4E4E));//set background color
	}
}
