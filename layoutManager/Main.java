package layoutManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		//Layout Manager = defines the natural layout for components within a container

		//BorderLayout = a BorderLayout places components in five areas: NORTH, SOUTH, EAST, WEST, CENTER
		//				 all extra space is placed in the center area.
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout(10, 10 /*margin: width, height*/));
		frame.setSize(350, 350);
		
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.blue);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.green);
		panel5.setBackground(Color.MAGENTA);
		
		panel1.setPreferredSize(new Dimension(100, 100));
		panel2.setPreferredSize(new Dimension(100, 100));
		panel3.setPreferredSize(new Dimension(100, 100));
		panel4.setPreferredSize(new Dimension(100, 100));
		panel5.setPreferredSize(new Dimension(100, 100));
		
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.SOUTH);
		frame.add(panel3, BorderLayout.EAST);
		frame.add(panel4, BorderLayout.WEST);
		frame.add(panel5, BorderLayout.CENTER);
		
	}

}
