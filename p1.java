//a. Develop a java program for performing various string operations with different string handling
//functions directed as follows
//String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching,
//Substring Operations , String Modification, Whitespace Handling, String Concatenation, String
//Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and
//endsWith()


package StringOperations;
import java.util.*;
public class p1 {
	
	
	    public static void main(String[] args) {

	        // String Creation
	        String str1 = "Hello";
	        String str2 = "World";
	        String email = "user@example.com";

	        System.out.println("Original Strings:");
	        System.out.println("str1 = " + str1);
	        System.out.println("str2 = " + str2);

	        // Length and Character Access
	        System.out.println("\nLength of str1: " + str1.length());
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // String Comparison
	        System.out.println("\nString Comparison:");
	        System.out.println("str1 equals str2: " + str1.equals(str2));
	        System.out.println("str1 equalsIgnoreCase 'hello': "
	                + str1.equalsIgnoreCase("hello"));

	        // String Searching
	        System.out.println("\nString Searching:");
	        System.out.println("Index of 'l' in str1: "
	                + str1.indexOf('l'));

	        // Substring Operations
	        System.out.println("\nSubstring:");
	        System.out.println("Substring of str1 (1 to 4): "
	                + str1.substring(1, 4));

	        // String Modification
	        System.out.println("\nString Modification:");
	        System.out.println("Replace 'l' with 'x': "
	                + str1.replace('l', 'x'));

	        // Whitespace Handling
	        String spaced = "   Java Programming   ";
	        System.out.println("\nWhitespace Handling:");
	        System.out.println("Before trim: '" + spaced + "'");
	        System.out.println("After trim: '" + spaced.trim() + "'");

	        // String Concatenation
	        String concat = str1.concat(" ").concat(str2);
	        System.out.println("\nConcatenation:");
	        System.out.println("Concatenated String: " + concat);

	        // String Splitting
	        String sentence = "Java,Python,C++";
	        String[] languages = sentence.split(",");

	        System.out.println("\nString Splitting:");
	        for (String lang : languages) {
	            System.out.println(lang);
	        }

	        // StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Java");
	        sb.append(" Programming");

	        System.out.println("\nStringBuilder Demo:");
	        System.out.println(sb);

	        // String Formatting
	        int age = 20;
	        String formatted =
	                String.format("Name: %s, Age: %d",
	                        "Student", age);

	        System.out.println("\nString Formatting:");
	        System.out.println(formatted);

	        // Email Validation
	        System.out.println("\nEmail Validation:");

	        if (email.contains("@")
	                && email.startsWith("user")
	                && email.endsWith(".com")) {

	            System.out.println("Valid Email Format");
	        }
	        else {
	            System.out.println("Invalid Email Format");
	        }

	    }
	}

