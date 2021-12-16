package Tasks_51_60;

import java.util.Random;

public class Task_57 {
	
	public static void main(String[] args) {
			
			int integer = generateRandomThreeDigitInteger();
			System.out.println(integer);
			
			checkCondition(integer);
		
	}
	
	private static int generateRandomThreeDigitInteger() {
		//Generates a three digit integer
		Random random = new Random();
		
		return random.nextInt(900) + 100;
	}
	
	
	private static int getUnitsDigit(int integer) {
		// gets an integer as an input and returns the units digit of the given integer.
	
		return integer % 10;
		
	}
	
	private static int getTensDigit(int integer) {
		// gets an integer as an input and returns the tens digit of the given integer.
	
		return (integer / 10) % 10;
	}
	
	private static int getHundredsDigit(int integer) {
		// gets an integer as an input and returns the hundreds digit of the given integer.
	
		return (integer / 100) % 10;
	}
	
	private static void checkCondition(int number) {
		/**
		 * if the number is greater than 300, the method will print out the ratio of tens digit and units digit.
		 * if not, it will print out the ratio of hundreds digit and units digit
		 */
		
		if(getUnitsDigit(number) == 0) {
			System.out.println("The condition cannot be checked because division by zero is undefined.");
		}
		else {
			if(number > 300) System.out.println((double)getTensDigit(number)/(double)getUnitsDigit(number));
			else System.out.println((double)getHundredsDigit(number)/(double)getUnitsDigit(number));
		}
	}
	

}
