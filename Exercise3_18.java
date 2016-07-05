import java.util.Scanner;
public class Exercise3_18 {

	public static void main(String[] args) {
		/* Cost of shipping program - A shipping company uses a set of functions 
		 * to calculate shipping costs (in dollars) of shipping based on weight 
		 * of package in pounds
		 * Program prompts user to enter in weight of package, and displays shipping cost
		 * if weight is > 50, print"The package cannot be shipped" 
		 * Topic 2 Chapter 3 Exercise 3.18
         * File: Exercise3_18.java
         * Author: Lee Tompkins 
         * Date: Jun 30 2016
		 */

		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Please enter a weight in pounds of the package to be shipped to find the cost of shipping the package"); // prompt user to enter in the weight of the package to be shipped 
		double weight = input.nextDouble();   // store user input for the weight of the package as variable weight 
		double w = weight; // set weight varaible equal to w 
		
		if (0 < w && w <= 1)  // Determine the cost to ship the package based on weight, and display the cost of shipping the package 
			System.out.println("The cost to ship this package is $3.50");
		else if (1 < w && w <= 3)
			System.out.println("The cost to ship this package is $5.50");
		else if (3 < w && w <= 10)
			System.out.println("The cost to ship this package is $8.50");
		else if (10 < w && w <= 20)
			System.out.println("The cost to ship this package is $10.50");
		else if (20 < w && w <= 50)
			System.out.println("The cost to ship this package is $20.50");
		else if (50 < w)
			System.out.println("This package cannot be shipped");
			
		
		
		
	}

}
