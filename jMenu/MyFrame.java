package jMenu;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener{
	
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350, 350);
		this.setLayout(new FlowLayout());
		
		loadIcon = new ImageIcon("upload.png");
		saveIcon = new ImageIcon("diskette.png");
		exitIcon = new ImageIcon("button.png");
		//create menu bar
		menuBar = new JMenuBar();
		//create menu
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
	
		//add menu to menu bar
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		//create sub menu for menu
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		//add action listener to the sub menu
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		//add icon to sub menu
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		//set shortcut key
		fileMenu.setMnemonic(KeyEvent.VK_F);//alt + f to load
		editMenu.setMnemonic(KeyEvent.VK_E);//alt + e to save
		helpMenu.setMnemonic(KeyEvent.VK_H);//alt + h to exit
		loadItem.setMnemonic(KeyEvent.VK_L);//l to load
		saveItem.setMnemonic(KeyEvent.VK_S);//s to save
		exitItem.setMnemonic(KeyEvent.VK_E);//e to exit
		//add sub menu to menu
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		//add menuBar to this frame
		this.setJMenuBar(menuBar);
		//must be last line to see the menu
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loadItem) {
			System.out.println("Load file completed!");
		}
		if(e.getSource()==saveItem) {
			System.out.println("Saved");
		}
		if(e.getSource()==exitItem) {
			//exit program
			System.exit(0);
		}
	}
	
}
