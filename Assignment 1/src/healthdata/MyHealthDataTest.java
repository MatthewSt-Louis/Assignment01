package healthdata;
import java.util.*;
/**
 *File Name: MyHealthDataTest
 *Author: Matthew St. Louis
 *Course: CST 8284 OOP (Java)
 *Assignment: Assignment #1
 *Date: 2022-11-05
 *Professor: Sandra Iroakazi
 *Purpose: This program is designed to store and manipulate data entered by a user. The data is regarding
 *patient health information. It calculates their BMI, max/min/target heart rates, and displays all the information for 
 *the user to see. Also take advantage of JUnit 4 testing to ensure stability of class-level methods.
 */	


/**
 * this class contains the main() method of the program, it takes user input and 
 * uses various methods from a MyHealthData object to store and display said data.
 * @author Matthew St. Louis
 * @version 1.0
 * @since 11.0.16.1
 * */
public class MyHealthDataTest {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String firstName = "";
		String lastName = "";
		String gender = "";
		int birthYear = 0;
		int currentYear = 2022;
		int height = 0;
		int weight = 0;
		
		/**
		 * Just taking input and storing them in local variables to be
		 * used in the constructor afterwards
		 */
		System.out.printf("Enter your first name: ");
		firstName = keyboard.nextLine();
		System.out.printf("Enter your last name: ");
		lastName = keyboard.nextLine();
		System.out.printf("Please enter your gender: ");
		gender = keyboard.nextLine();
		System.out.printf("Please enter your birth year: ");
		birthYear = keyboard.nextInt();
		System.out.printf("Please enter your height in inches: ");
		height = keyboard.nextInt();
		System.out.printf("Please enter your weight in pounds: ");
		weight = keyboard.nextInt();
		//using stored input, instantiate MyHealthData object 	
		MyHealthData patient = new MyHealthData(firstName, lastName, gender, birthYear, currentYear, height, weight);
		//print stored data using class-level method
		patient.displayMyHealthData();
		keyboard.close();
	}//end of main

}//end of class
