package basicJava_jSlider;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener{

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo(){
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		//minimal value, maximal value, start value
		slider = new JSlider(0, 100, 50);
		
		slider.setPreferredSize(new Dimension(400, 200));
		
		//to show the ticks for slider bar
		slider.setPaintTicks(true);
		//show every 10 value
		slider.setMinorTickSpacing(10);
		
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		
		slider.setPaintLabels(true);
		slider.setFont(new Font("tahoma", Font.PLAIN, 14));
		
		//change slider style
		slider.setOrientation(SwingConstants.VERTICAL);
		//slider.setOrientation(SwingConstants.HORIZONTAL);;
		
	
		label.setFont(new Font("tahoma", Font.PLAIN, 13));
		
		//add the change listener to the slider 
		//pass this because this class is already implements the changeListener class
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420, 420);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		//show text according to the selected slider
		label.setText("C = " + slider.getValue());
	}

}
