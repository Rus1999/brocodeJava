package basicJava_jTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{

	//declare outside for action performed to work 
	JButton button;
	JTextField textField;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Submit");
		//add action listener (this) because this class already implements ActionListener Class
		button.addActionListener(this);
		
		textField = new JTextField();
		//set textField dimension (width, height)
		textField.setPreferredSize(new Dimension(250, 40));
		//set textField font
		textField.setFont(new Font(null, Font.PLAIN, 35));
		//set textField font color
		textField.setForeground(new Color(0xFF4E4E));
		//set textField background color
		textField.setBackground(new Color(0x000000));
		//set textField caret color
		textField.setCaretColor(new Color(0xFFFFFF));
		//set textField pretext 
		textField.setText("Type Here");
		
		
		this.add(button);
		this.add(textField);
		this.pack(); //adjust size to fit the component
		this.setVisible(true);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//check if the event is the button
		if(e.getSource()==button) {
			//get the text in the textField
			System.out.println("Welcome " + textField.getText());
			//set editable of the textField
			textField.setEditable(false);
			//set button enabled to false
			button.setEnabled(false);
		}
			
		
	}

}
