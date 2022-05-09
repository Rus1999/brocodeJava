package flowLayoutManager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		//Layout Manager = defines the natural layout for components within a container
		
		//FlowLayout = places components in a row, sized at their preferred size.
		//			   if the horizontal space in the container is too small,
		//			   the FlowLayout class uses the next available row.
	
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(350, 350);
		frame.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10 /*FlowLayout.*, x-margin, y-margin */));
		
		JPanel panel = new JPanel();
		//set panel size
		panel.setPreferredSize(new Dimension(250, 250));
		panel.setBackground(new Color(0xFF4F4F));
		panel.setLayout(new FlowLayout());
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		
		frame.add(panel);
	}
}
