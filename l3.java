// Write a Java program to insert the specified element at the end of a linked list.( using
//l_listobj.offerLast(&quot;Pink&quot;))

package LinkedListPrograms;
import java.util.LinkedList;

public class l3 {
	
	    public static void main(String[] args) {

	        LinkedList<String> l_listobj = new LinkedList<>();

	        l_listobj.add("Red");
	        l_listobj.add("Blue");
	        l_listobj.add("Green");

	        // Insert at end
	        l_listobj.offerLast("Pink");

	        System.out.println("Linked List after inserting at end:");
	        System.out.println(l_listobj);
	    }
	}

