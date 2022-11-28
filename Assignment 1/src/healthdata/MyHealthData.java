package healthdata;
//22F CST8284
//Assignment 1: MyHealthData.java

//This system maintains important health information about a patient.
//Note: This class assumes values passed to the set methods are correct.
// REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!

/**
 * The main object that will be used in this program. It stores, manipulates, and displays all
 * data entered by the user. 
 * @author Matthew St. Louis
 * @version 1.0
 * @since 11.0.16.1
 * */
public class MyHealthData {
//variable declarations
	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private int currentYear;
	private double height;// in inches
	private double weight;//in pounds
	
	
	/**
	 * Overload constructor
	 * @param first - String of first name
	 * @param last - String of last name
	 * @param gen - String of gender
	 * @param birthY - int of year born
	 * @param currentY - int of the current year
	 * @param h - double of patient's height in inches
	 * @param w - double of patient's weight in pounds
	 * */
	public MyHealthData(String first, String last, String gen, int birthY, int currentY, double h, double w) {
		this.setFirstName(first);
		this.setLastName(last);
		this.setGender(gen);
		this.setBirthYear(birthY);
		this.setCurrentYear(currentY);
		this.setHeight(h);
		this.setWeight(w);
	}
		
	/**
	 * method designed the calculate the patient's BMI
	 * @return patient's calculate BMI
	 * */
	public double getBMI() {
	   return (getWeight() * 703) / (getHeight() * getHeight());
	} 
	
	/**
	 * method for calculating the patient's age
	 * @return the patients age based on current year minus birth year
	 * */
	public int getAge() {
		int age = this.currentYear - this.birthYear;
		
		return age;
	}
	
	/**
	 * method for calculating the persons maxHR
	 * @return patient's max heart rate (220 minus age)
	 * */
	public int getMaxHR() {
		int maxHR = 220 - this.getAge();
		
		return maxHR;
	}
	
	/**
	 * method for calculating their minHR which is 
	 * @return patient's min heart rate (50% of max)
	 * */
	public double getMinHR() {
		double minHR = this.getMaxHR() * 0.5;
		
		return minHR;
	}
	
	/**
	 * method for calculating the their targetHR
	 * @return patient's target heart rate (85% of max)
	 * */
	public double getTargetHR() {
		double targetHR = this.getMaxHR() * 0.85;
		
		return targetHR;
	}
	// TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION
	
	/**
	 * Print Method
	 * method simply takes all the data stored in the object at the time
	 * and prints it nicely for the user to see.
	 * */
	public void displayMyHealthData() 
	{ 
	//printing and formatting all stored information for the user to see
	System.out.printf("Name: " + this.firstName + " " + this.lastName + "\n" +
						"Gender: " + this.gender + "\n" + "Birth Year: " + this.birthYear + "\n" +
						"Height: " + this.height + "\n" + "Weight: " + this.weight + "\n" +
						"Age: " + this.getAge() + "\n" + "BMI: " + this.getBMI() + "\n" +
						"Max HR: " + this.getMaxHR() + " " + "Min HR: " + this.getMinHR() + "\n" + 
						"Target HR: " + this.getTargetHR() + "\n \n");
	   
	
	   System.out.println("BMI VALUES");
	   System.out.println("Underweight: less than 18.5");
	   System.out.println("Normal:      between 18.5 and 24.9");
	   System.out.println("Overweight:  between 25 and 29.9");
	   System.out.println("Obese:       30 or greater");   
	}
	
	
	/**
	 * GETTERS AND SETTERS BELOW
	 * */
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public int getCurrentYear() {
		return currentYear;
	}
	
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
		
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	} 

} // end class MyHealthData



