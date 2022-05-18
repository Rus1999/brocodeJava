package basicJava_jRadioButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener{


	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	ImageIcon pizzaIcon;
	ImageIcon hamburgerIcon;
	ImageIcon hotdogIcon;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaIcon = new ImageIcon("pizza.png");
		hamburgerIcon = new ImageIcon("cheeseburger.png");
		hotdogIcon = new ImageIcon("hot-dog.png");
		
		pizzaButton = new JRadioButton("Pizza");
		pizzaButton.setFocusable(false);
		pizzaButton.addActionListener(this);
		pizzaButton.setIcon(pizzaIcon);
		
		hamburgerButton = new JRadioButton("Hamburger");
		hamburgerButton.setFocusable(false);
		hamburgerButton.addActionListener(this);
		hamburgerButton.setIcon(hamburgerIcon);
		
		hotdogButton = new JRadioButton("Hotdog");
		hotdogButton.setFocusable(false);
		hotdogButton.addActionListener(this);
		hotdogButton.setIcon(hotdogIcon);
		
		//group button
		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);
		
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pizzaButton) {
			System.out.println("You ordered pizza");
		}
		else if(e.getSource()==hamburgerButton){
			System.out.println("You ordered hamburger");
		}
		else if(e.getSource()==hotdogButton) {
			System.out.println("You ordered hotdog");
		}
	}
	
}
