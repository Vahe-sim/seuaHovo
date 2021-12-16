package Tasks_51_60;

import java.util.Random;

public class Task_56 {
	
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
		 * If the units digit is greater than the tens digit of the integer, the method will print the sum of digits divided by the integer.
		 * If not, it will print the integer. 
		 */
		
		if(getUnitsDigit(number) > getTensDigit(number)) {
			System.out.println((double)(getUnitsDigit(number) + getTensDigit(number) + getHundredsDigit(number))/(double)number);
		}
		else System.out.println(number);
		
	}

}
