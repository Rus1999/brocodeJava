package basicJava_jOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		//JOptionPane = pop up a standard dialog box that prompts users for a value
		//				or informs them of something
		//JOptionPane.showMessageDialog(null, "Plain message", "Title", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Information message", "Title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Question message", "Title", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Warning message", "Title", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Error message", "Title", JOptionPane.ERROR_MESSAGE);
	
		//return value Yes = 0, No = 1, Cancel = 2, closeButton = -1
		//JOptionPane.showConfirmDialog(null, "Message", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
		
		//String name = JOptionPane.showInputDialog("What is your name?: ");
		//System.out.println(name);
		
		String[] responses = {"No, you're awesome!", "Thank you", "*sweat*"};
		ImageIcon icon = new ImageIcon("th.jpg");
		JOptionPane.showOptionDialog(null, "You are awsome!", "sercret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 2/*Initial select button*/);
	}
}
