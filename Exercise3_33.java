import java.util.*;
public class Exercise3_33 {

	public static void main(String[] args) {
		/* (Financial Compare Cost) Prompts user to enter weight and price for 2 
		 *  Separate packages of rice, then displays the package with the best price 
		 *  Topic 2 Chapter 3 Exercise 3.33
		 *  Author: Lee Tompkins
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price followed by weight of package 1");
		double price1 = input.nextDouble();
		double weight1 = input.nextDouble();
		
		System.out.print("Enter the price followed by weight of package 2");
		double price2 = input.nextDouble();
		double weight2 = input.nextDouble();
		
		double price2weight1 = price1 / weight1;
		double price2weight2 = price2 / weight2;
		
		if (price2weight1 > price2weight2)
			System.out.println("Package 2 is a better price");
		else if (price2weight1 < price2weight2)
			System.out.println("Package 1 is a better price");

	}

}
