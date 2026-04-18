//Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
//Collections.swap(l_list, 0, 2))

package LinkedListPrograms;
import java.util.LinkedList;
import java.util.Collections;

public class p5 {
	
	    public static void main(String[] args) {

	        LinkedList<String> l_list = new LinkedList<>();

	        l_list.add("Red");
	        l_list.add("Blue");
	        l_list.add("Green");
	        l_list.add("Yellow");

	        System.out.println("Before swapping:");
	        System.out.println(l_list);

	        // Swap first and third elements
	        Collections.swap(l_list, 0, 2);

	        System.out.println("After swapping first and third elements:");
	        System.out.println(l_list);
	    }
	}

