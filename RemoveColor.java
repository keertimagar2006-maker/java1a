//Write a java program for getting different colors through ArrayList interface and remove the
//2nd element and color &quot;Blue&quot; from the ArrayList


package ArrayListprograms;
import java.util.ArrayList;

public class RemoveColor {
	
	    public static void main(String[] args) {

	        ArrayList<String> colors = new ArrayList<>();

	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Red");
	        colors.add("Yellow");

	        System.out.println("Original List: " + colors);

	        // Remove 2nd element (index 1)
	        colors.remove(1);

	        // Remove Blue
	        colors.remove("Blue");

	        System.out.println("After Removing: " + colors);
	    }
	}

