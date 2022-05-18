package basicJava_jPanel;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		// JPanel = a GUI component that functions as a container to hold other components
		ImageIcon icon = new ImageIcon("thumbs-up.png");

		
		JLabel label = new JLabel();
		label.setText("Hello world");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(-10, -75, 100, 100);
		
		JPanel pinkPanel = new JPanel();
		pinkPanel.setBackground(new Color(0xFF4E4E));
		/*
		 * when .setLayout is null
		 * we have to put the position, width, height
		 * .setBounds(x, y, width, height)
		*/
		pinkPanel.setBounds(0, 0, 250, 250);
		pinkPanel.setLayout(null);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(new Color(0x4293f5));
		bluePanel.setBounds(250, 0, 250, 250);
		bluePanel.setLayout(null);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(new Color(0x42f572));
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(null);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750, 750);
		frame.setVisible(true);
		pinkPanel.add(label);
		frame.add(pinkPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		
	}
}
