import java.util.Scanner;
public class Exercise3_5 {

	public static void main(String[] args) {
		/* A program that prompts a user to enter an integer for todays day of
		 * the week (Sunday = 0, Monday = 1, ect...) Also promts a user to enter
		 * a number of days after today and display the future day
         * File: Exercise3_5.java
         * Author: Lee Tompkins 
         * Date: Jun 29 2016
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number for the current day of the week, Sunday equals 0, Saturday equals 6, ect..."); // Prompt user for a number associated with the day of the week 
		int intDayNum = input.nextInt();  // Store user input as variable intDayNum
		System.out.print("Enter a number of days since the initial day"); // Prompt user to enter in a number of days since the current day of the week 
		int addedDays = input.nextInt();  // Store user input for the number of days in into the future 
		String dayName = ""; // declare dayName varaible 
		int dayNum = 0;   // declare dayNum varaible 
		//System.out.print(dayNum); 
			for(int x = intDayNum + addedDays; x > 6; x = 7 % x) { // Set a loop that keeps days within a 0 - 6 cycle 
				
				//System.out.print(dayNum);
				if(x <=6) {
					dayNum = x; // break the loop once x is less than or equal to six 
					break;
				}
			}
				
		//System.out.print(dayNum);
		switch (dayNum) { // Select the appropriate dayName for the future day of the week 
			case 0: dayName = "Sunday";
				break;
			case 1: dayName = "Monday";
				break;
			case 2: dayName = "Tuesday";
				break;
			case 3: dayName = "Wednesday";
				break;
			case 4: dayName = "Thursday";
				break;
			case 5: dayName = "Friday";
				break;
			case 6: dayName = "Saturday";
				break;
			default: dayName = "Invalid day";
				break;
			
		}
		System.out.println(addedDays + " days from now is " + dayName);   // Display the name of the future day of the week 
		
	}

}
