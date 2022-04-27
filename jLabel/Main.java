package jLabel;

//import section
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
	public static void main(String[] args) {
		
		//create ImageIcon
		ImageIcon logoIcon = new ImageIcon("th.jpg");				
		ImageIcon labelIcon = new ImageIcon("chick.png"); 					
		//create border (color,size) 
		Border border = BorderFactory.createLineBorder(new Color(0xFF4E4E),1);
		
		
		JLabel label = new JLabel(/*"Label Here!!!"*/);//create instance of JLabel named label
		label.setText("Kokk kooo!!!");//set label text | can be done in constructor 
		label.setIcon(labelIcon);//set icon on label
		label.setHorizontalTextPosition(JLabel.CENTER);//set textLabel left,center,right of ImageIcon
		label.setVerticalTextPosition(JLabel.TOP);//set textLabel left,center,right of ImageIcon
		label.setForeground(new Color(0xFFFFFF));//set textLabel to the chosen color
		label.setFont(new Font("Alien Encounters", Font.BOLD,77));//set textLabel font to new Font("Font name", style, size)
		label.setIconTextGap(-42);//set gap between text and image | can be negative number
		label.setBackground(Color.black);//to set background color you need to set opaque to true
		label.setOpaque(true);//set opaque to true so background set can be effect
		label.setBorder(border);//set border
		label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER);//set horizon position of icon+text within label
		//label.setBounds(0, 0, 550, 500);//set bounds for the label (positionX,positionY,Width,Height)
		
		JFrame frame = new JFrame();//create instance of JFrame Class named "frame"
		frame.setVisible(true);//set visibility
		//frame.setSize(350, 350);//set width 350, height 350
		//frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set close button to do what is suppose to do
		frame.setTitle("JLabel");//set title to "JLabel"
		frame.getContentPane().setBackground(new Color(0xFF4E4E));//change background color by first call getContentPane method then set background color by (new Color(r,g,b)) OR (new Color(0xFFFFFF)) OR (Color.red) 
		frame.add(label);//add label to the frame
		frame.setIconImage(logoIcon.getImage());//set frame icon to image 
		//frame.pack() must done after added all the component of the program
		frame.pack();//resize the frame to accommodate to the size of object within the frame
	}
}
