//Write a java program for getting different colors through ArrayList interface and extract the
//elements 1st and 2nd from the ArrayList object by using SubList()

package ArrayListprograms;
import java.util.ArrayList;
import java.util.List;

public class SubListExample {
	
	    public static void main(String[] args) {

	        ArrayList<String> colors = new ArrayList<>();

	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Red");
	        colors.add("Yellow");

	        // Extract first and second elements
	        List<String> subColors = colors.subList(0, 2);

	        System.out.println("Original List: " + colors);
	        System.out.println("SubList (1st & 2nd): " + subColors);
	    }
	}

