package bankApp;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * This Runner class is used to obtain customer information from a text file 
 * and create multiple bank accounts based on it and display information about them
 * 
 *
 */

public class TestApp {
	
	public static void main(String[] args) {
		
		//1. Create a List of Accounts and initialize it
		
		List <Account> accounts = new ArrayList<Account>();
		
		//2. Create a List of customers
		//Read new account holder information from a file customers.txt by calling the utility method readFromAFile()
		//and store it into a List of String[] 
		
		String file = "customers.txt";
		List<String[]> newAccountHolders = Utility.readFromAFile(file);
		
		for (String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String ssn = accountHolder[1];
			String accountType = accountHolder[2];
			double balance = Double.parseDouble(accountHolder[3]);
			
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, ssn, balance));
			}
			else if (accountType.equals("Checking")){
				accounts.add(new Checking(name, ssn, balance));
			}
			else {
				System.out.println("NO ACCOUNT TYPE SPECIFIED");
			}
		}
		
		//3. Add new accounts to List of Accounts		
		//Loop through the List of customers and get the information for each new customer (name, ssn, accountType, initialBalance )
		// and create a new Savings or Checking account based on the accountType and add that new Account to the 
		// List of Accounts
		
	
		
		//4. Loop through the List of Accounts and 
		// call showInfo() method on each account to display info about each created account
		
		for (Account acc : accounts) {
			System.out.println("\n**********************");
			acc.showInfo();
		}

			
	}

}
