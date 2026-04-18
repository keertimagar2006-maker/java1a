//Write a Java program to iterate a linked list in reverse order (using
//objlist.descendingIterator())

package LinkedListPrograms;
import java.util.LinkedList;
import java.util.Iterator;

public class l2 {
	
	    public static void main(String[] args) {

	        LinkedList<String> objlist = new LinkedList<>();

	        objlist.add("Red");
	        objlist.add("Blue");
	        objlist.add("Green");
	        objlist.add("Yellow");

	        Iterator<String> iterator = objlist.descendingIterator();

	        System.out.println("Linked List in reverse order:");

	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}

