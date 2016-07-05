import java.util.Scanner;
import java.math.*;
public class Exercise3_17 {

	public static void main(String[] args) {
		// A program that play rock paper scissors, computer generates either rock paper scissors 
		// user inputs 0 for scissors 1 for rock 2 for paper 
		// Topic 2 Chapter 3 Exercise 3.17
        // Author: Lee Tompkins 
        // File: Exercise3_17.java
        // Date: Jun 30 2016
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Play rock paper scissors! Enter 0 for scissors, 1 for rock, or 2 for paper"); // Prompt the user to enter in a number between 0 - 3 to play rock paper scissors vs the computer
		int playerChoice = input.nextInt(); // store users input as variable playerChoice 
		
		Random computerChoice = new Random(); 
		int x  = (int)(Math.random() * 3); // Generate a random number between 0 - 3 for the computer player and set it to varialbe x 
		
		//System.out.print(x);
		int y = playerChoice; // Set playerChoice variable equal to y varaible 
		
		switch (y) {  // select the correct case and statement for the x variable, and display if the player or computer wins, or if it is a draw 
			case 0: {
				if (x == 0) 
					System.out.println("Its a draw, you both chose scissors!");
				else if (x == 1)
					System.out.println("The computer chose Rock! Rock beats scissors!");
				else if (x == 2)
					System.out.println("The computer chose Paper! Scissors beats paper!");
				break;}
			case 1: {
				if (x == 0) 
					System.out.println("The computer chose Scissors!, Rock beats scissors!");
				else if (x == 1)
					System.out.println("Its a draw! You both chose Rock");
				else if (x == 2)
					System.out.println("The computer chose paper! Paper beats rock!");
				break;}
			case 2: {
				if (x == 0) 
					System.out.println("The computer chose Scissors!, Scissors beats Paper!");
				else if (x == 1)
					System.out.println("The computer chose Rock! Paper beats rock!");
				else if (x == 2)
					System.out.println("Its a draw! You both chose paper!");
				break;}
		}
	}

}
