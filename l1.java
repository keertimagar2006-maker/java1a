//1. Write a Java program to iterate through all elements in a linked list starting at the
//specified position ( 2 nd ) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
package LinkedListPrograms;
import java.util.LinkedList;
import java.util.ListIterator;
public class l1 {
	
	    public static void main(String[] args) {

	        LinkedList<String> listobj = new LinkedList<>();

	        listobj.add("Red");
	        listobj.add("Blue");
	        listobj.add("Green");
	        listobj.add("Yellow");
	        listobj.add("Pink");

	        // Start iterator from 2nd position (index 1)
	        ListIterator<String> iteratorobj = listobj.listIterator(1);

	        System.out.println("Elements starting from 2nd position:");

	        while (iteratorobj.hasNext()) {
	            System.out.println(iteratorobj.next());
	        }
	    }
	}

