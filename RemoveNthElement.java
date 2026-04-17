//Write a java program for getting different colors through ArrayList interface and delete nth
//element from the ArrayList object by using remove by index


package ArrayListprograms;
import java.util.ArrayList;
import java.util.Scanner;
public class RemoveNthElement {
	
	    public static void main(String[] args) {

	        ArrayList<String> colors = new ArrayList<>();
	        Scanner sc = new Scanner(System.in);

	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Red");
	        colors.add("Yellow");

	        System.out.println("Original List: " + colors);

	        // Get nth position
	        System.out.print("Enter position to delete (starting from 1): ");
	        int n = sc.nextInt();

	        // Remove nth element
	        if (n > 0 && n <= colors.size()) {
	            colors.remove(n - 1);
	            System.out.println("After Deleting: " + colors);
	        } else {
	            System.out.println("Invalid position!");
	        }

	        sc.close();
	    }
	}

