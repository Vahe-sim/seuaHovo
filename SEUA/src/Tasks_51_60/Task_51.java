package Tasks_51_60;

import java.util.Random;

public class Task_51 {
	
	public static void main(String[] args) {

		int number = generateRandomThreeDigitInteger();
		System.out.println(number);
		
		/**
		 * variable t assumes that the sum of the hundreds and thousands digits is 
		 * equal to the units digit of the integer.
		 */
		boolean t = true;
		
		checkT(number, t);		
		
		
	}
	
	private static int generateRandomThreeDigitInteger() {
		//generates a random three-digit integer.
		
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
	
	private static void checkT(int integer, boolean condition) {
		// checks whether the sum of the hundreds and thousands digits is equal to the units digit of a number.
		
		if(getUnitsDigit(integer) == getHundredsDigit(integer) + getTensDigit(integer)) System.out.println(condition);
		else System.out.println(!condition);
	}

}
