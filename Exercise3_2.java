import java.util.*;
import java.math.*;
public class Exercise3_2 {

	public static void main(String[] args) {
		/* Sum Game, generate 3 random single digit integers and prompt
		 * user to enter the sum of the three digits
		 * Chapter 3 Exercise 3.2
         * File: Exercise3_2.java
         * Author: Lee Tompkins
         * Date:Jun 29 2016
		 */
		Scanner input = new Scanner(System.in);
		Random generateRandom = new Random();
		
		int a  = (int)(Math.random() * 10);   // Generate a random number for the variable a 
		int b  = (int)(Math.random() * 10);   // Generate a random number for the variable a
		int c  = (int)(Math.random() * 10);   // Generate a random number for the variable a
		
		System.out.print("Enter the sum of the three numbers " + a + "," + b + "," + c);  // Prompt user to input values for the sum of the three variables a, b, and c 
		int sum = input.nextInt();            // store user input as the sum of the three variables 
		
		int d = a + b + c;
		
		if(sum == d) {
			System.out.println("Correct! The sum of the three numbers is " + sum);   // Display if the user answer is correct for the sum of the three varaibles or not 
		} else {
			System.out.println("Wrong! The sum of the three numbers is " + d);   
		}
		
		
		
		
		
		
	}

}
