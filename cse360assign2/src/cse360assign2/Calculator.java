/**
 * Author: Joseph Mathew
 * Class ID: 478
 * Assignment Number: 2
 * 
 * The class makes a Calculator Object with
 * support for basic numerical operations
 */


package cse360assign2;

public class Calculator {

	private int total;
	
	
	/**
	 * Constructor Method that returns a calculator object with a 
	 * total value equal to 0
	 * 
	 * @return      Calculator Object that a total val of 0
	 */	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	
	/**
	 * Method that returns the total value
	 *
	 * @return      integer value of 0
	 */	
	public int getTotal () {
		return 0;
	}
	
	
	/**
	 * Method that takes in an integer value and adds it to the 
	 * total value
	 * 
	 * @param      integer value to be added to running total
	 */	
	public void add (int value) {
		
	}
	
	
	/**
	 * Method that takes in an integer value and subtracts it from the 
	 * total value
	 * 
	 * @param      integer value to be subtracted from the running total
	 */	
	public void subtract (int value) {
		
	}
	
	
	/**
	 * Method that takes in an integer value and multiplies it by the 
	 * total value
	 * 
	 * @param      integer value to be multiplied by running total
	 */	
	public void multiply (int value) {
		
	}
	
	
	/**
	 * Method that takes in an integer value and divides the 
	 * total value by it. If 0, the total should be set to 0
	 * 
	 * @param      integer value to divide the running total by
	 */	
	public void divide (int value) {
		
	}
	
	
	/**
	 * Method that takes returns the history of operations
	 * 
	 * @return     String of operation history 
	 */	
	public String getHistory () {
		return "";
	}
}