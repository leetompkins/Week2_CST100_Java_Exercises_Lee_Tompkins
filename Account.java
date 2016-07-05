/* Account class 
 * Date Jun 3 2016
 * Author Lee Tompkins
 * File Account.java
 */
public class Account {
	
	
	// Declare variables 
	
	
	private java.util.Date date = new java.util.Date();
	private int id;
	private double balance;
	private double annualInterestRate;
	private long dateCreated = date.getTime();
	
	// Variable getters 
	
	int getID() {
		return id;
	}
	double getBalance() {
		return balance;
	}
	double getAnnualInterestRate() {
		return annualInterestRate;
	}
	long getDateCreated() {
		return dateCreated;
	}
	// Variable setters 
	public void setID(int newID) {
		id = newID;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	double getMonthlyInterest() {
		// Get monthly interest from annual interest
		return annualInterestRate / 12 / 100 * balance;
	}
	public void withdraw(double withdrawAmount) {
		// withdraw from balance
		 balance = balance - withdrawAmount;
	}
	public void deposit(double depositAmount) {
		// add to balance
		balance = balance + depositAmount;
	}
	public void setDateCreated() {
		//set date account was created 
		dateCreated = date.getTime();
	}
	Account() { // constructor default
		
	}
	
	Account(int id, double balance){ // specified constructor
		
	}
}
