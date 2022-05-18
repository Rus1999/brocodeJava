package basicJava_jframe;

public class Main {

	public static void main(String[] args) {
		// JFrame = a GUI window to add components to
		/*
		JFrame frame = new JFrame();//create a frame
		frame.setTitle("WowZaa");//set title of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit application
		frame.setResizable(false);//prevent frame from resized
		frame.setVisible(true);//make frame visible
		frame.setSize(420,420);//set size x,y
		
		ImageIcon image = new ImageIcon("th.jpg");//crate an image icon
		frame.setIconImage(image.getImage());//change icon of the frame
		frame.getContentPane().setBackground(new Color(0xFF4E4E));//set background color
		*/
		
		new MyFrame();
	}

}
