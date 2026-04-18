//5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
//France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display them on console
//whenever the countries are selected on the list.

package Swing;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListDisplay {
	// CountryListDisplay.java

	

	    public static void main(String[] args) {

	        JFrame frame = new JFrame("Country List");

	        // Country List
	        String countries[] = {
	            "USA", "India", "Vietnam",
	            "Canada", "Denmark", "France",
	            "Great Britain", "Japan",
	            "Africa", "Greenland", "Singapore"
	        };

	        // Create JList
	        JList<String> list =
	                new JList<>(countries);

	        // Selection Listener
	        list.addListSelectionListener(
	            new ListSelectionListener() {

	            public void valueChanged(
	                ListSelectionEvent e) {

	                if (!e.getValueIsAdjusting()) {

	                    String selected =
	                        list.getSelectedValue();

	                    System.out.println(
	                        "Selected Country: "
	                        + selected);
	                }
	            }
	        });

	        frame.add(new JScrollPane(list));

	        frame.setSize(300, 250);
	        frame.setDefaultCloseOperation(
	                JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	
}
