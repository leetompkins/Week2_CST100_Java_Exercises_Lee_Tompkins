/* Class for Testing Quadratic equation 
 * File: TestQuadraticEquation.java 
 * Author: Lee Tompkins
 * Date: July 3 2016
 * Exercise 9.10 Week 2 
 */

import java.util.Scanner;


public class TestQuadraticEquation {

	public static void main(String[] args) {
		
		
		QuadraticEquation qe = new QuadraticEquation(); // constructor 

		Scanner input = new Scanner(System.in);
		System.out.print("Enter in a Value for a, b, and c");
		qe.setA(input.nextInt());
		qe.setB(input.nextInt());
		qe.setC(input.nextInt());
		
		
		//System.out.println(qe.getDiscriminant());
		
		
		if (qe.getDiscriminant() > 0) {
			System.out.println(qe.getRoot1());
			System.out.println(qe.getRoot2());
		} 
		else if (qe.getDiscriminant() == 0) {
			System.out.println(qe.getRoot1());
		}
		else if (qe.getDiscriminant() < 0) {
			System.out.println("The equation has no roots");
		}
		
		
		
	}

}
