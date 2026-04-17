//Write a java program for getting different colors through ArrayList interface and search whether
//the color &quot;Red&quot; is available or not
package ArrayListprograms;
import java.util.ArrayList;
public class SearchColor {
	

	
	    public static void main(String[] args) {

	        ArrayList<String> colors = new ArrayList<>();

	        // Adding colors
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Red");
	        colors.add("Yellow");

	        // Searching for Red
	        if (colors.contains("Red")) {
	            System.out.println("Red color is available in the list.");
	        } else {
	            System.out.println("Red color is NOT available in the list.");
	        }

	        System.out.println("Colors: " + colors);
	    }
	}

