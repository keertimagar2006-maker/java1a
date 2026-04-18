//3a. Develop a java program for performing various string operations with different string handling
//functions directed as follows:
//String Creation and Basic Operations, Length and Character Access, String Comparison, String
//Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
//String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
//startsWith() and endsWith()


package StringOperations;
import java.util.*;

public class p3 {
	public static void main(String[] args) {

	        // String Creation
	        String s1 = "Java";
	        String s2 = "Programming";

	        System.out.println("String Creation:");
	        System.out.println("s1 = " + s1);
	        System.out.println("s2 = " + s2);

	        // Length and Character Access
	        System.out.println("\nLength and Character Access:");
	        System.out.println("Length of s1: " + s1.length());
	        System.out.println("Character at index 2 in s1: " 
	                           + s1.charAt(2));

	        // String Comparison
	        System.out.println("\nString Comparison:");
	        System.out.println("s1 equals 'Java': " 
	                           + s1.equals("Java"));
	        System.out.println("s1 equalsIgnoreCase 'java': " 
	                           + s1.equalsIgnoreCase("java"));

	        // String Searching
	        System.out.println("\nString Searching:");
	        System.out.println("Index of 'a' in s1: " 
	                           + s1.indexOf('a'));

	        // Substring Operations
	        System.out.println("\nSubstring Operation:");
	        System.out.println("Substring of s2 (0 to 6): " 
	                           + s2.substring(0, 6));

	        // String Modification
	        System.out.println("\nString Modification:");
	        System.out.println("Replace 'a' with 'o' in s1: " 
	                           + s1.replace('a', 'o'));

	        // Whitespace Handling
	        String s3 = "   Hello Java   ";
	        System.out.println("\nWhitespace Handling:");
	        System.out.println("Before Trim: '" + s3 + "'");
	        System.out.println("After Trim: '" + s3.trim() + "'");

	        // String Concatenation
	        String s4 = s1.concat(" ").concat(s2);
	        System.out.println("\nString Concatenation:");
	        System.out.println("Concatenated String: " + s4);

	        // String Splitting
	        String fruits = "Apple,Mango,Orange";
	        String arr[] = fruits.split(",");

	        System.out.println("\nString Splitting:");
	        for (String f : arr) {
	            System.out.println(f);
	        }

	        // StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Welcome");
	        sb.append(" Student");

	        System.out.println("\nStringBuilder Demo:");
	        System.out.println(sb);

	        // String Formatting
	        int roll = 101;
	        String formatted = String.format(
	                "Roll No: %d, Name: %s",
	                roll, "Ravi");

	        System.out.println("\nString Formatting:");
	        System.out.println(formatted);

	        // Email Validation
	        String email = "student@example.com";

	        System.out.println("\nEmail Validation:");

	        if (email.contains("@") &&
	            email.startsWith("student") &&
	            email.endsWith(".com")) {

	            System.out.println("Valid Email Address");
	        }
	        else {
	            System.out.println("Invalid Email Address");
	        }

	    }
	}

