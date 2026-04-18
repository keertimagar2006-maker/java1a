//3c. String Exercise progams
//Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
//capitalizeWords()
//Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
//defined function truncate()
//Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
//function isNumeric()

//Q9. Write a Java Program for Creating a random string of a specified length using user defined
//function generateRandomString()
//Q10. Write a Java Program for Counting the number of words in a string using user defined function
//countWords()

package StringOperations;
import java.util.Scanner;
import java.util.Random;
public class p5 {
	

	    // Q6: Capitalize first letter of each word
	    public static String capitalizeWords(String str) {

	        String words[] = str.split("\\s+");
	        String result = "";

	        for (String word : words) {

	            if (word.length() > 0) {

	                result += Character.toUpperCase(word.charAt(0))
	                        + word.substring(1).toLowerCase() + " ";
	            }
	        }

	        return result.trim();
	    }

	    // Q7: Truncate string and add ellipsis
	    public static String truncate(String str, int length) {

	        if (str.length() <= length) {
	            return str;
	        }

	        return str.substring(0, length) + "...";
	    }

	    // Q8: Check numeric string
	    public static boolean isNumeric(String str) {

	        return str.matches("[0-9]+");
	    }

	    // Q9: Generate random string
	    public static String generateRandomString(int length) {

	        String characters =
	                "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	        Random rand = new Random();

	        String result = "";

	        for (int i = 0; i < length; i++) {

	            int index = rand.nextInt(characters.length());

	            result += characters.charAt(index);
	        }

	        return result;
	    }

	    // Q10: Count words
	    public static int countWords(String str) {

	        if (str.trim().isEmpty()) {
	            return 0;
	        }

	        String words[] = str.trim().split("\\s+");

	        return words.length;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Q6
	        System.out.print("Enter a sentence: ");
	        String input1 = sc.nextLine();

	        System.out.println("Capitalized Sentence:");
	        System.out.println(capitalizeWords(input1));

	        // Q7
	        System.out.print("\nEnter string to truncate: ");
	        String input2 = sc.nextLine();

	        System.out.print("Enter maximum length: ");
	        int len = sc.nextInt();
	        sc.nextLine();

	        System.out.println("Truncated String:");
	        System.out.println(truncate(input2, len));

	        // Q8
	        System.out.print("\nEnter string to check numeric: ");
	        String input3 = sc.nextLine();

	        if (isNumeric(input3)) {

	            System.out.println("String contains only numeric characters");
	        }
	        else {

	            System.out.println("String contains non-numeric characters");
	        }

	        // Q9
	        System.out.print("\nEnter length for random string: ");
	        int randLen = sc.nextInt();

	        System.out.println("Random String:");
	        System.out.println(generateRandomString(randLen));

	        sc.nextLine();

	        // Q10
	        System.out.print("\nEnter sentence to count words: ");
	        String input4 = sc.nextLine();

	        System.out.println("Number of words:");
	        System.out.println(countWords(input4));

	        sc.close();
	    }
	
}
