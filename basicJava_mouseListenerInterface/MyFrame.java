package basicJava_mouseListenerInterface;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{
	
	JLabel label;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setBackground(new Color(0xFF4E4E));
		label.setOpaque(true);
		label.addMouseListener(this);
		
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//Invoked when a mouse button has been clicked (pressed and released) on a component
		//System.out.println("You clicked the mouse");
		//label.setBackground(Color.BLACK);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//Invoked when a mouse button has been pressed on a component
		//System.out.println("You pressed the mouse");
		//label.setBackground(Color.BLUE);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//Invoked when a mouse button has been released on a component
		//System.out.println("You released the mouse");
		//label.setBackground(Color.WHITE);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//Invoked when the mouse enters a component
		//System.out.println("You entered the component");
		//label.setBackground(Color.GRAY);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//Invoked when the mouse exits a component
		//System.out.println("You exited the component");
		//label.setBackground(Color.YELLOW);
	}
}
