package basicJava_dragNDrop;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	DragPanel dragPanel = new DragPanel();
	MyFrame(){
	
		this.add(dragPanel);
		this.setTitle("Drag & Drop demo");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
