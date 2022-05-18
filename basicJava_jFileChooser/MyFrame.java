package basicJava_jFileChooser;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select File");
		button.addActionListener(this);
		
		
		this.add(button);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			//create an instance of JFileChooser
			JFileChooser fileChooser = new JFileChooser();
			
			//change the current directory when dialog is shown
			fileChooser.setCurrentDirectory(new File("."));
			
			//select file to open and return 0 if opened the file
			//int response = fileChooser.showOpenDialog(null);
			
			//attempt to save the file
			int response = fileChooser.showSaveDialog(null);
			
			//check if file is successful select the file (not cannot or exit)
			if(response == JFileChooser.APPROVE_OPTION) {
				//store the location of the file
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}
		
	}

}
