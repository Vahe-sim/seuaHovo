package Tasks_51_60;

import java.util.Arrays;
import java.util.Random;

public class Task_55 {
	
	public static void main(String[] args) {
		
		int number = generateRandomThreeDigitInteger();
		
		System.out.println(number);
		
		getMinimumDigit(number);
	
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
	
	private static void getMinimumDigit(int integer) {
		//prints out the minimum value of its digits
		
		int[] digits = {getUnitsDigit(integer), getHundredsDigit(integer), getTensDigit(integer)};
		
		Arrays.sort(digits);
		
		System.out.println("The minimum digit of the number is " + digits[0]);
		
	}


}
