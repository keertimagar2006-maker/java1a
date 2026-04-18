//5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
//France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the capital of the
//countries on console whenever the countries are selected on the list.

package Swing;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;
public class CountryCapitalList {
	// CountryCapitalList.java

	

	    public static void main(String[] args) {

	        JFrame frame =
	            new JFrame("Country Capitals");

	        // Countries
	        String countries[] = {
	            "USA", "India", "Vietnam",
	            "Canada", "Denmark", "France",
	            "Great Britain", "Japan",
	            "Africa", "Greenland", "Singapore"
	        };

	        // Capitals Map
	        HashMap<String, String> capitals =
	                new HashMap<>();

	        capitals.put("USA", "Washington DC");
	        capitals.put("India", "New Delhi");
	        capitals.put("Vietnam", "Hanoi");
	        capitals.put("Canada", "Ottawa");
	        capitals.put("Denmark", "Copenhagen");
	        capitals.put("France", "Paris");
	        capitals.put("Great Britain", "London");
	        capitals.put("Japan", "Tokyo");
	        capitals.put("Africa", "No single capital");
	        capitals.put("Greenland", "Nuuk");
	        capitals.put("Singapore", "Singapore");

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
	                        "Capital of "
	                        + selected + " : "
	                        + capitals.get(selected));
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
