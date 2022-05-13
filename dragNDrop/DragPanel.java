package dragNDrop;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragPanel extends JPanel{

	ImageIcon image = new ImageIcon("party.png");
	final int WIDTH = image.getIconWidth();
	final int HEIGHT = image.getIconHeight();
	Point imageCorner;
	Point previousPoint;
	
	DragPanel(){
		
		//set position of the image
		imageCorner = new Point(0, 0);
		ClickListener clikcListener = new ClickListener();
		DragListener drageListener = new DragListener();
		this.addMouseListener(clikcListener);
		this.addMouseMotionListener(drageListener);
	}
	
	//repaint image after update the new position of the image
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
	}
	
	//---------------------
	//wait until mouse is clicked
	private class ClickListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			//update previousPoint to wherever we click
			previousPoint = e.getPoint();
		}
	}
	
	//move the image according to the mouse
	private class DragListener extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e) {
			Point currentPoint = e.getPoint();
			
			//translate to the new position wherever the currentPoint is after draging the mouse
			imageCorner.translate(
				(int)(currentPoint.getX() - previousPoint.getX()), 
				(int)(currentPoint.getY() - previousPoint.getY())
			);
			previousPoint = currentPoint;
			repaint();
			
		}
	}
}
