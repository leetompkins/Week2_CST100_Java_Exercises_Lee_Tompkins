/* Class for the Quadratic equation 
 * File: QuadraticEquation.java 
 * Author: Lee Tompkins
 * Date: July 3 2016
 * Exercise 9.10 Week 2 
 */
public class QuadraticEquation {
// ax^2 + bx + c = 0 
	//Declare varaibles 
	private int a;
	private int b;
	private int c;
	int discriminant;
	double r1;
	double r2;
	QuadraticEquation() { // Constructor
		
	}
	
	public void setA(int newA){
		// Set a
		a = newA;	
	}
	public void setB(int newB){
		// set b 
		b = newB;
	}
	public void setC(int newC){
		// set c 
		c = newC;
	}
	int getA(){
		// get a 
		return a;
	}
	int getB(){
		// get b
		return b;
	}
	int getC(){
		// get c 
		return c;
	}
	double getDiscriminant(){
		// Get discriminant
		return (b * b) - 4 * (a * c); 
	}
	double getRoot1() {
		// get 1st root
			return r1 = (-b + Math.sqrt((b * b) - 4 * (a * c))) / (2 * a);
	}
	double getRoot2() {
		// get 2nd root
			return r2 = (-b - Math.sqrt((b * b) - 4 * (a * c))) / (2 * a);
	}
}



