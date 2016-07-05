import java.util.Scanner;
public class Exercise3_29 {

	public static void main(String[] args) {
		/* (Geometry of two circles) Program prompts a user to enter the center coords 
		 * and radii of two circles and determines whether the second circle is inside the first
		 * or overlaps the first
		 * Topic 2 Chapter 3 Exercise 3.29
		 * Author: Lee Tompkins 
         * File: Exercise3_29.java
         * Date: Jun 30 2016
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter in the x , y, coordinates of the center of the first circle and the radius");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();
		System.out.print("Enter in the x , y, coordinates of the center of the second circle and the radius");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();
		
		double x1x2 = Math.abs(x1 - x2);
		double y1y2 = Math.abs(y1 - y2);
		double c = Math.sqrt((x1x2 * x1x2) + (y1y2 * y1y2));
		
		if (c <= Math.abs(r1 - r2))
			System.out.println("Circle 2 is inside Circle 1");
		else if (c <= r1 + r2)
			System.out.println("Circle 2 overlaps Circle 1");
	}

}
