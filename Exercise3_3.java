import java.util.Scanner;
public class Exercise3_3 {

	public static void main(String[] args) {
		/* Prompts user to enter a, b, c, d, e, & f, if ad - bc = 0 report, no solution 
		 * Uses Cramer's Rule, Chapter 3 Exercise 3.3
         * File: Exercise3_3.java
         * Author: Lee Tompkins
         * Date: Jun 29 2016
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("To solve for x & y using Cramer's equation, enter numeric valaues for a, b, c, d, e, & f"); // Prompr user for input on variables associated with Cramer's rule 

		double a = input.nextDouble();    
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();    // Store user input as associated varaibles 
		double ad = a * d;    
		double bc = b * c;
		double noSolution = ad - bc;
		double x = ((e * d) - (b * f)) / ((a*d) - (b * c));   // find x using Cramer's rule
		double y = ((a * f) - (e * c)) / ((a * d) - (b * c)); // find y using Cramer's rule
		if(noSolution == 0) {
			System.out.println("The equation has no solution");
		} else {
			System.out.println("x is equal to " + x + " y is equal to " + y); // Display if the equation has a solution or no solution 
		}
		
	}

}
