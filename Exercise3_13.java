import java.util.Scanner;
public class Exercise3_13 { //Compute Tax 

	public static void main(String[] args) {
		/* Complete listing of 3.5 in Chapter three to compute the taxes for all filing statuses
		* Topic 3 Chapter 3 Exercise 3.13 (p. 113 for source code) 
		* Author: Lee Tompkins 
        * File: Exercise3_13.java
        * Author: Lee Tompkins 
        * Date: Jun 30 2016
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("(0-single filer, 1-married jointly or " +
				"qualifying widow(er), 2-married separately, 3-head of " +
				"household) Enter the filing status:"); // Prompt user for the type of tax filer 
		int status = input.nextInt(); // store user tax filer status as variable status 
		
		System.out.print("Enter Taxable Income"); // Prompt user to enter in taxable income 
		double income = input.nextDouble();   // store user taxable income as varaible income 
		
		double tax = 0;   // Declare tax vraible 
		if (status == 0) {    // For user tax filer status determine tax for income bracket 
			if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = income * 0.10 + (income - 8350) * 0.15;
			else if (income <= 82250)
				tax = income * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
			else if (income <= 171550)
				tax = income * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			else if (income <= 372950)
				tax = income * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
			else 
				tax = income * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
			}
		else if (status == 1) { // For user tax filer status determine tax for income bracket
			if (income <= 16700)
				tax = income * 0.10;
			else if (income <= 67900)
				tax = income * 0.10 + (income - 16700) * 0.15;
			else if (income <= 137050)
				tax = income * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
			else if (income <= 208850)
				tax = income * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
			else if (income <= 372950)
				tax = income * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (income - 208850) * 0.33;
			else 
				tax = income * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
		}
		else if (status == 2) { // For user tax filer status determine tax for income bracket
			if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = income * 0.10 + (income - 8350) * 0.15;
			else if (income <= 68525)
				tax = income * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
			else if (income <= 104425)
				tax = income * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
			else if (income <= 186475)
				tax = income * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (income - 104425) * 0.33;
			else 
				tax = income * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33 + (income - 186475) * 0.35;
		}
		else if (status == 3) { // For user tax filer status determine tax for income bracket
			if (income <= 11950)
				tax = income * 0.10;
			else if (income <= 45500)
				tax = income * 0.10 + (income - 11950) * 0.15;
			else if (income <= 117450)
				tax = income * 0.10 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;
			else if (income <= 190200)
				tax = income * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
			else if (income <= 372950)
				tax = income * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (income - 190200) * 0.33;
			else 
				tax = income * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
		}
		else {
			System.out.println("Error, Invalid Status"); // If tax status entered is not valid, display it is not a valid status 
			System.exit(1); // quit the program if status is not valid 
		}
		System.out.println("Tax is " + (int)(tax * 100) / 100.0); // display the tax for the users status and taxable income 
	}

}
