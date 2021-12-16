package Tasks_51_60;

import java.util.Random;

public class Task_52 {
	
	public static void main(String[] args) {
		
		int number = generateRandomThreeDigitInteger();
		System.out.println(number);
		
		sameDigits(number);
		
	}
	
	
	private static int generateRandomThreeDigitInteger() {
		//generates a random three-digit integer.
		
		Random random = new Random();
		return random.nextInt(900) + 100;
	}
	
	private static void sameDigits(int integer) {
		//Checks whether the number contains equal digits
		
		//assumes initially that the number does not contain equal digits
		boolean t = false;
		
		int[] digits = {getUnitsDigit(integer), getHundredsDigit(integer), getTensDigit(integer)};
		
		for(int i = 1; i < digits.length; i++) {
			if(digits[0] == digits[i]) t = true;
		}
		System.out.println(t);
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

}
