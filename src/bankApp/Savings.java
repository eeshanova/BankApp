package bankApp;

/**
 * 
 * A class that represents a Savings account
 * Must extend abstract Account class to inherit generic account properties and behaviors
 *
 */

public class Savings extends Account{
	
	/*
	 * Declare the following fields for Savings account:
	 * 
	 * savingsAccountID - represents savings account ID
	 * savingsAccountPin - represents savings account Pin
	 * 
	 * Fields must be properly encapsulated
	 */
	
	private int savingsAccountID;
	private int savingsAccountPin;
	
		
	/*
	 * Constructor that initializes Savings account object
	 * 
	 * Besides calling its super class constructor, this constructor must do the following:
	 * - change accountNumber for Savings account by adding "2" before super class's accountNumber
	 * - initialize savingsAccountID  by generating 3-digit random number
	 * - initialize savingsAccountPin  by generating 4-digit random number
	 * - set the interest rate by calling setInterestRate() method
	 */

	public Savings(String name, String ssn, double balance) {
		super(name, ssn, balance);
		
		this.accountNumber = 2 + this.accountNumber;
		this.savingsAccountID = (int)(Math.random() * 1000);
		this.savingsAccountPin = (int)(Math.random() * 10000);
		this.setInterestRate();
	}
	
	
	/*
	 * Override super class's showInfo() method by ADDING Savings account specific info
	 * such as account type, savingsAccountID, savingsAccountPin and interestRate
	 * 
	 * Ex:
	 * 	NAME: Arielle Duncan
		SSN: 444102638
		ACCOUNT NUMBER: 2263824734805
		BALANCE: 1000.0
		ACCOUNT TYPE: Savings
		SAVINGS ACCOUNT ID: 237
		SAVINGS ACCOUNT PIN: 4402
		INTEREST RATE: 2.25%
	 * 
	 */
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: SAVINGS");
		System.out.println("SAVINGS ACCOUNT ID: " + this.savingsAccountID + 
				"\nSAVINGS ACCOUNT PIN: " + this.savingsAccountPin + 
				"\nINTEREST RATE: " + this.interestRate + "%");
	}
	

	/*
	 * Implement setInterestRate() method of BaseInterestRate interface
	 * 
	 * Savings account interest rate must be set to 0.25% less the baseInterestRate declared in Account class
	 */
	
	@Override
	public void setInterestRate() {
		this.interestRate = getBaseInterestRate() - 0.25;
	}

}
