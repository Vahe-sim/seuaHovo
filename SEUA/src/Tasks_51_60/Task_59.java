package Tasks_51_60;

import java.util.Random;
import java.util.Arrays;

public class Task_59 {
	
	public static void main(String[] args) {
			
			int integer = generateRandomThreeDigitInteger();
			System.out.println(integer);
			
			printSortedDigits(integer);
			
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
	
	private static void printSortedDigits(int number) {
		//sorts the digit of  the given number
		
		int[] digits = {getUnitsDigit(number), getTensDigit(number), getHundredsDigit(number)};
		
		Arrays.sort(digits);
		
		for(int i = 0; i < digits.length; i++) {
			System.out.print(digits[i] + " ");
		}
		
	}

}
