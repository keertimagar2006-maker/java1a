//3b. String Exercise progams
//Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
//defined function isNullOrEmpty().
//Q2. Write a Java Program for Counting how many times a substring appears in a main string
//using user defined function countOccurrences()
//Q3. Write a Java Program for Reversing the characters in a string using user defined function
//reverseString().
//Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
//and punctuation) using user defined function isPalindrome():
//Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
//function removeWhitespace()

package StringOperations;
import java.util.Scanner;
public class p4 {
	 // Q1: Check Null or Empty
	    public static boolean isNullOrEmpty(String str) {

	        if (str == null || str.trim().length() == 0) {
	            return true;
	        }
	        return false;
	    }

	    // Q2: Count Substring Occurrences
	    public static int countOccurrences(String mainStr,
	                                       String subStr) {

	        int count = 0;
	        int index = 0;

	        while ((index = mainStr.indexOf(subStr, index)) != -1) {

	            count++;
	            index = index + subStr.length();
	        }

	        return count;
	    }

	    // Q3: Reverse String
	    public static String reverseString(String str) {

	        String reversed = "";

	        for (int i = str.length() - 1; i >= 0; i--) {

	            reversed = reversed + str.charAt(i);
	        }

	        return reversed;
	    }

	    // Q4: Check Palindrome
	    public static boolean isPalindrome(String str) {

	        str = str.replaceAll("[^a-zA-Z0-9]", "")
	                 .toLowerCase();

	        String reversed = reverseString(str);

	        return str.equals(reversed);
	    }

	    // Q5: Remove Whitespace
	    public static String removeWhitespace(String str) {

	        return str.replaceAll("\\s", "");
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Q1
	        System.out.print("Enter a string for NULL check: ");
	        String str1 = sc.nextLine();

	        if (isNullOrEmpty(str1)) {
	            System.out.println("String is NULL or Empty");
	        }
	        else {
	            System.out.println("String is NOT Empty");
	        }

	        // Q2
	        System.out.print("\nEnter main string: ");
	        String mainStr = sc.nextLine();

	        System.out.print("Enter substring: ");
	        String subStr = sc.nextLine();

	        int occ = countOccurrences(mainStr, subStr);

	        System.out.println("Occurrences: " + occ);

	        // Q3
	        System.out.print("\nEnter string to reverse: ");
	        String revInput = sc.nextLine();

	        System.out.println("Reversed String: "
	                + reverseString(revInput));

	        // Q4
	        System.out.print("\nEnter string to check palindrome: ");
	        String palInput = sc.nextLine();

	        if (isPalindrome(palInput)) {

	            System.out.println("It is a Palindrome");
	        }
	        else {

	            System.out.println("Not a Palindrome");
	        }

	        // Q5
	        System.out.print("\nEnter string to remove whitespace: ");
	        String whiteInput = sc.nextLine();

	        System.out.println("After removing whitespace:");
	        System.out.println(removeWhitespace(whiteInput));

	        sc.close();
	    }
	
}
