//4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed”
//depending upon the Jbutton either Srilanka or India is pressed by implementing the event handling
//mechanism with addActionListener( ).

package Swing;
import javax.swing.*;
import java.awt.event.*;

public class CountryButtonEvent implements ActionListener {
	
	        

	    JFrame frame;
	    JButton btnSrilanka, btnIndia;
	    JLabel label;

	    CountryButtonEvent() {

	        frame = new JFrame(
	                "Country Button Example");

	        btnSrilanka =
	                new JButton("Srilanka");

	        btnIndia =
	                new JButton("India");

	        label =
	                new JLabel("Press a Button");

	        // Set positions
	        btnSrilanka.setBounds(
	                100, 100, 120, 40);

	        btnIndia.setBounds(
	                250, 100, 120, 40);

	        label.setBounds(
	                150, 40, 250, 30);

	        // Add action listeners
	        btnSrilanka.addActionListener(this);
	        btnIndia.addActionListener(this);

	        // Add components
	        frame.add(btnSrilanka);
	        frame.add(btnIndia);
	        frame.add(label);

	        frame.setSize(500, 300);
	        frame.setLayout(null);
	        frame.setDefaultCloseOperation(
	                JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }

	    public void actionPerformed(
	            ActionEvent e) {

	        if (e.getSource()
	                == btnSrilanka) {

	            label.setText(
	            "Srilanka is pressed");
	        }

	        if (e.getSource()
	                == btnIndia) {

	            label.setText(
	            "India is pressed");
	        }
	    }

	    public static void main(
	            String[] args) {

	        new CountryButtonEvent();
	    }
	
}
