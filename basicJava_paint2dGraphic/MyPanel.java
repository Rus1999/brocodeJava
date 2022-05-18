package basicJava_paint2dGraphic;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	
	Image image;
	
	MyPanel(){
		
		//create image out of the imageIcon
		image = new ImageIcon("background1.png").getImage();
		this.setPreferredSize(new Dimension(500, 500));
		
	}
	
	@Override //can override be case JPanel is component
	public void paint(Graphics g) {
		//cast the Graphics to Graphics2D
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(image, 0, 0, null);
		g2D.setPaint(new Color(0xFF4E4E));
		//g2D.setStroke(new BasicStroke(5));
		//g2D.drawLine(0, 0, 500, 500);
		
		g2D.setPaint(Color.green);
		g2D.drawRect(0, 0, 100, 100);
		g2D.fillRect(0, 0, 100, 100);
		
		//g2D.setPaint(Color.orange);
		//g2D.drawOval(0, 0, 100, 100);
		//g2D.fillOval(100, 0, 100, 100);
	
		//g2D.setPaint(Color.red);
		//g2D.fillArc(0, 0, 100, 100, 0, 180);
		//g2D.setPaint(Color.white);
		//g2D.fillArc(0, 0, 100, 100, 180, 180);
	
		int[] xPoints = {150,250,350};
		int[] yPoints = {300,150,300};
		g2D.setPaint(Color.yellow);
		g2D.fillPolygon(xPoints ,yPoints ,3);
		
		//int[] xPoints = {150,250,350,100};
		//int[] yPoints = {300,150,300,100};
		//g2D.setPaint(Color.yellow);
		//g2D.fillPolygon(xPoints ,yPoints ,4);
		
		//g2D.setPaint(Color.magenta);
		//g2D.setFont(new Font("tahoma", Font.BOLD, 25));
		//g2D.drawString("U R A WINNER! :)", 50, 50);
	
	}
}
