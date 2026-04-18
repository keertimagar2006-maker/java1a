//4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass
//is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by
//implementing the event handling mechanism with addActionListener( ).

package Swing;
import javax.swing.*;
import java.awt.event.*;

public class ImageButtonEvent implements ActionListener {
	// ImageButtonEvent.java

	        
	    JFrame frame;
	    JButton btnClock, btnHourGlass;
	    JLabel label;

	    ImageButtonEvent() {

	        frame = new JFrame(
	                "Image Button Example");

	        // Load images
	        ImageIcon clockIcon =
	                new ImageIcon("clock.png");

	        ImageIcon hourIcon =
	                new ImageIcon("hourglass.png");

	        // Create buttons
	        btnClock =
	                new JButton(clockIcon);

	        btnHourGlass =
	                new JButton(hourIcon);

	        label =
	                new JLabel(
	                "Press Image Button");

	        // Set positions
	        btnClock.setBounds(
	                80, 100, 120, 120);

	        btnHourGlass.setBounds(
	                250, 100, 120, 120);

	        label.setBounds(
	                140, 40, 250, 30);

	        // Add listeners
	        btnClock.addActionListener(this);
	        btnHourGlass.addActionListener(this);

	        // Add components
	        frame.add(btnClock);
	        frame.add(btnHourGlass);
	        frame.add(label);

	        frame.setSize(450, 300);
	        frame.setLayout(null);
	        frame.setDefaultCloseOperation(
	                JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }

	    public void actionPerformed(
	            ActionEvent e) {

	        if (e.getSource()
	                == btnClock) {

	            label.setText(
	            "Digital Clock is pressed");
	        }

	        if (e.getSource()
	                == btnHourGlass) {

	            label.setText(
	            "Hour Glass is pressed");
	        }
	    }

	    public static void main(
	            String[] args) {

	        new ImageButtonEvent();
	    }
	
}
