import java.math.*;
import java.util.Scanner;

public class Exercise3_4 {

	public static void main(String[] args) {
		/* A program that generates a random integer between 1 and 12
		* and displays the corresponding month Chapter 3 Exercise 3.4
        * File: Exercise3_4.java
        * Author: Lee Tompkins
        * Date: Jun 29 2016
		*/ 
		Random month = new Random();
		int monthNum = 1 + (int)(Math.random() * 12); // Generate a number between 1 and 12 
		String monthName = "";
		switch (monthNum) {   // Choose the cooresponding month for the generated number
			case 1: monthName = "January";
				break;
			case 2: monthName = "February";
				break;
			case 3: monthName = "March";
				break;
			case 4: monthName = "April";
				break;
			case 5: monthName = "May";
				break;
			case 6: monthName = "June";
				break;
			case 7: monthName = "July";
				break;
			case 8: monthName = "August";
				break;
			case 9: monthName = "September";
				break;
			case 10: monthName = "October";
				break;
			case 11: monthName = "November";
				break;
			case 12: monthName = "December";
				break;
		
		
		}
		System.out.println(monthName); // Display the month associated with the random number 
	}

}
