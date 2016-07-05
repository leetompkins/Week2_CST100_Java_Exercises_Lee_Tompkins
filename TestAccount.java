/* Account test class 
 * Date Jun 3 2016
 * Author Lee Tompkins
 * File TestAccount.java
 */
public class TestAccount {

	public static void main(String[] args) {
		// Construct Account1 from Account class 
		// Set account properties 
		Account account1 = new Account();
		account1.setID(1155);
		account1.setBalance(20000.00);
		account1.setAnnualInterestRate(4.5);
		account1.setDateCreated();
		
		
		
		
		
		account1.withdraw(2500.00); // remove money
		account1.deposit(3000.00); // add money
		
		
		// Display balance, date created, & interest for the month based on balance
		System.out.println("The account has a balance of $" + account1.getBalance());
		System.out.println("The account monthly interest is $" + account1.getMonthlyInterest());
		System.out.println("The account was created " + account1.getDateCreated() + " milliseconds since Jan1 1970");
		
		
		
		

	}

}
