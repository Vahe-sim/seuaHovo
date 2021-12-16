package Tasks_51_60;

import java.util.Arrays;
import java.util.Random;

public class Task_54 {
	
	public static void main(String[] args) {
			
			int number = generateRandomThreeDigitInteger();
			
			System.out.println(number);
			
			getMaximumDigit(number);
		
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
	
	private static void getMaximumDigit(int integer) {
		//prints out the maximum value of its digits
		
		int[] digits = {getUnitsDigit(integer), getHundredsDigit(integer), getTensDigit(integer)};
		
		Arrays.sort(digits);
		
		System.out.println("The maximum digit of the number is " + digits[digits.length -1]);
		
	}

}
