// 4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing Programming
//in Blue color plain font with font size of 32 using Jframe and Jlabel
package Swing;
import javax.swing.*;
import java.awt.*;

public class HelloSwingMessage {
	// HelloSwingMessage.java

	
	    public static void main(String[] args) {

	        // Create JFrame
	        JFrame frame = new JFrame("Swing Hello Program");

	        // Create JLabel
	        JLabel label = new JLabel(
	        "Hello! VI C , Welcome to Swing Programming");

	        // Set font
	        label.setFont(new Font(
	                "Arial",
	                Font.PLAIN,
	                32));

	        // Set color
	        label.setForeground(Color.BLUE);

	        // Center alignment
	        label.setHorizontalAlignment(
	                JLabel.CENTER);

	        // Add label
	        frame.add(label);

	        // Frame settings
	        frame.setSize(750, 200);
	        frame.setDefaultCloseOperation(
	                JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}

