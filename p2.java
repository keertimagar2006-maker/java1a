//2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending
//the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which
//one is better.

package StringOperations;

public class p2 {
	// p2.java

	
	    public static void main(String[] args) {

	        int n = 10000;

	        // StringBuffer Test
	        StringBuffer sbuffer = new StringBuffer();

	        long start1 = System.currentTimeMillis();

	        for (int i = 0; i < n; i++) {
	            sbuffer.append("AIET");
	        }

	        long end1 = System.currentTimeMillis();

	        System.out.println("Time taken by StringBuffer: "
	                + (end1 - start1) + " ms");



	        // StringBuilder Test
	        StringBuilder sbuilder = new StringBuilder();

	        long start2 = System.currentTimeMillis();

	        for (int i = 0; i < n; i++) {
	            sbuilder.append("AIET");
	        }

	        long end2 = System.currentTimeMillis();

	        System.out.println("Time taken by StringBuilder: "
	                + (end2 - start2) + " ms");



	        // Justification
	        System.out.println("\nConclusion:");

	        System.out.println(
	        "StringBuilder is faster than StringBuffer " +
	        "because it is non-synchronized, " +
	        "while StringBuffer is synchronized and thread-safe."
	        );

	    }
	}

