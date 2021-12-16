package Tasks_51_60;

import java.util.Random;

public class Task_53 {
	
	public static void main(String[] args) {
		
		int number = generateRandomThreeDigitInteger();
		
		int k = generateRandomThreeDigitInteger();
		
		System.out.println(number);
		System.out.println(k);
		
		checkCondition(number, k);
		
	}
	
	private static int generateRandomThreeDigitInteger() {
		//Generates a three digit integer
		Random random = new Random();
		
		return random.nextInt(900) + 100;
	}
	
	private static void checkCondition(int x, int y) {
		/**
		 * if x > y, the method returns the value of x divided by the sum of its digits.
		 * otherwise, it will return the units digit if x divided by x.
		 */
		
		if(x > y) {
			double result = (double)x / (double)(getHundredsDigit(x) + getUnitsDigit(x) + getTensDigit(x));
			System.out.println(result);
		}
		else System.out.println((double)getUnitsDigit(x) / (double)x);
		
		
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
