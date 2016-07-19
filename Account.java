/* Summary: An Account class with getters, setters for balance, ID, annual interest rate,
 * and date the account was created.
 * Date June 3 2016
 * Author Lee Tompkins
 * File Account.java
 * Week2 Exercise 9.7
 */
public class Account {
	
	
	// Declare variables 
	
	
	private java.util.Date date = new java.util.Date();
	private int id;
	private double balance;
	private double annualInterestRate;
	private long dateCreated = date.getTime();
	 
	
	int getID() {
		// Get ID
		return id;
	}
	double getBalance() {
		// Get balance
		return balance;
	}
	double getAnnualInterestRate() {
		// get annual interest rate
		return annualInterestRate;
	}
	long getDateCreated() {
		// get date created 
		return dateCreated;
	}
	public void setID(int newID) {
		// set ID
		this.id = newID;
	}
	public void setBalance(double newBalance) {
		// Set balance
		this.balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		// set annual interest rate
		this.annualInterestRate = newAnnualInterestRate;
	}
	double getMonthlyInterestRate() {
		// get monthly interest rate
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
		this.id = id;
		this.balance = balance;
	}
}
