import java.util.Scanner;
public class Exercise3_26 {

	public static void main(String[] args) {
		/* Prompts the user to enter an integer and determines if the integer
		 * is divisible by 5 and 6, 5 or 6, 
         * File: Exercise3_26.java
         * Author: Lee Tompkins 
         * Date: Jun 30 2016
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter in an integer to determine if it is divisible by 5 and 6, 5 or 6, or 5 or 6 but not both"); // prompt user to enter an integer
		int userInput = input.nextInt();  // store user input as variable userInput
		int x = userInput;    // set variable userInput equal to varialbe x 
		if (x % 5 == 0 && x % 6 == 0) // Determine if the user input is divisible by 5 and 6, 5 or 6, or one but not both, and display result 
			System.out.println("The integer " + x + " is divisable by 5 & 6");
		else if (x % 5 == 0 || x % 6 == 0)
			System.out.println("The integer " + x + " is divisable by 5 or 6");
		else if (x % 5 == 0 ^ x % 6 == 0)
			System.out.println("The integer " + x + " is divisable by 5 or 6 but not both");
		
	}

}
