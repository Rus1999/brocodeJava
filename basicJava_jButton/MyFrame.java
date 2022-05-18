package basicJava_jButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	
	//declare a button outside the constructor
	JButton button;
	
	JLabel label;
	
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("cursor.png");
		ImageIcon icon2 = new ImageIcon("love.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(100, 205, 256, 256);
		label.setVisible(false);
		
		//finish instantiating within the constructor
		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		//listening to the action in this button object
		button.addActionListener(this);
		//button.addActionListner(e -> System.out.println(" "));
		
		button.setText("I'm a button");
		//setButton to non-focusable
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("comic Sans",Font.BOLD,25));
		button.setIconTextGap(10);
		//change font color
		button.setForeground(Color.ORANGE);
		button.setBackground(Color.gray);
		button.setBorder(BorderFactory.createBevelBorder(0));
		//button.setEnabled(false);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//check the event that occurs is button
		if(e.getSource() == button) {
			//System.out.println("Tick");
			//button.setEnabled(false);
			
			//show label when clicked
			label.setVisible(true);
		}
	}
}
