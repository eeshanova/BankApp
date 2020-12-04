package bankApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Utility {
	
	
	/*
	 * Implement a static utility method that reads from a .txt file and returns the information in the file
	 * as a List of String [], where each element (i.e String[] ) represents each line in the file
	 * which contains all the required information about each customer (name, ssn, accountType, initialBalance)
	 * 
	 * To read from a file use Scanner class and nextLine() method
	 * 
	 * Use try-catch block to handle the FileNotFoundException
	 *
	 * Optionally use try-with-resources statement to auto-close the Scanner object 
	 */
	public static List<String[]> readFromAFile(String pathToTheFile) {
		
		List <String[]> data = new LinkedList<String[]>();
		
		
		try {
			Scanner input = new Scanner (new File(pathToTheFile));
			while (input.hasNext()) {
				String line = input.nextLine();
				String[] records = line.split(",");
				data.add(records);
			}
		} catch (FileNotFoundException e) {
			System.out.println("COULD NOT FIND FILE");
			e.printStackTrace();
		}
		return data;
	}
	
	

}
