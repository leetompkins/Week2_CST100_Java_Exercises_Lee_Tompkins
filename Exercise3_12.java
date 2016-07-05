import java.util.Scanner;



public class Exercise3_12 {

	public static void main(String[] args) {
		/* Program that prompts a user to enter a three digit integer
		 * and determines if it is a Palindrome number (reads same left to right
		 * as from right to left (121, 343, 525, ect..) 
		 * Topic 2 Chapter 3 Exercise 3.12
         * File: Exercise3_12.java
         * Author: Lee Tompkins
         * Date: Jun 30 2016
		 */
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a three digit number to determine if it is a Palindrome number or not"); // Prompts user to enter in a three digit number to confirm if it is a Palindrome number or not 
		String number = input.next(); // Store user answer as a string variable 
		char a = number.charAt(0);    // Create a variale for the 1st number of the 3 digit number
		char b = number.charAt(2);    // Create a varaible for the 3rd number of the 3 didgit number
		
		if (a == b) 
			System.out.println(number + " is a Palindrome number");  // Check to see if the 1st number is equal to the third, if it is, display that it is a Palindrome number 
		else if (a != b)
			System.out.println(number + " is not a Palindrome number");
			
		
		

	}

}
