package healthdata;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *File Name: MyHealthDataTest2
 *Author: Matthew St. Louis
 *Course: CST 8284 OOP (Java)
 *Assignment: Assignment #1
 *Date: 2022-11-05
 *Professor: Sandra Iroakazi
 *Purpose: This is the JUnit testing class. Designed to test the stability of the getBMI() method from the
 *MyHealthData class. 
 */

/**
 * This class is the Unit testing class utilizing assertions from JUnit 4
 * @author Matthew St. Louis
 * @version 1.0
 * @since 11.0.16.1
 * @see JUnit 4 - assertions
 * */
public class MyHealthDataTest2 {

	/**
	 * Testing the getBMI method to ensure stability
	 */
	@Test
	public void getBMITest() {
		
		final double EXPECTED = 23.12088888888889;
		final double DELTA = 0.0000000000001;
		double actual = 0;
		
		//manually inserting values for testing purposes.
		MyHealthData healthData = new MyHealthData("Matt", "StLouis", "male", 1993, 2022, 75, 185);
		actual = healthData.getBMI();
		
		assertEquals("Expected value doesn't match!", EXPECTED, actual, DELTA);
		
	}
	
}
