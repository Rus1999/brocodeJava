package basicJava_jcomboBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {

	JComboBox comboBox;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals = {"dog", "cat", "fish"};
		//Must past the reference data || primitive with wrapper class (upper case variable) || objects
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		//comboBox.setEditable(true);
		//System.out.println(comboBox.getItemCount());
		//comboBox.addItem("horse");
		//comboBox.insertItemAt("pig", 0);
		//comboBox.setSelectedIndex(2);
		//comboBox.removeItem("horse");
		//comboBox.removeItemAt(2);
		//comboBox.removeAllItems();
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//when select one of the choice in comboBox
		//check when the comboBox does something then ...
		if(e.getSource()==comboBox) {
			//Return value
			//System.out.println(comboBox.getSelectedItem());
			//Return index
			System.out.println(comboBox.getSelectedIndex());
		}
	}

}
