package jLayeredPane;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Main {

	public static void main(String[] args) {
		//JLayeredPane = Swing container that provides a 
		//				 third dimension for positioning components
		//				 ex. depth, z-index

		JLabel label1 = new JLabel();
		label1.setOpaque(true);//set visible
		label1.setBackground(Color.RED);
		label1.setBounds(50, 50, 200, 200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);//set visible
		label2.setBackground(Color.blue);
		label2.setBounds(100, 100, 200, 200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);//set visible
		label3.setBackground(Color.green);
		label3.setBounds(150, 150, 200, 200);
		
		
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 500, 500);
		
		//JLayeredPane.layername || Integer.valueof(layernumber)
		layeredPane.add(label1, Integer.valueOf(0));
		layeredPane.add(label2, Integer.valueOf(5));
		layeredPane.add(label3, Integer.valueOf(1));
		
		JFrame frame = new JFrame("JLayeredPane");
		frame.add(layeredPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
