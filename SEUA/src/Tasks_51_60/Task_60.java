package Tasks_51_60;

import java.util.Arrays;
import java.util.Random;

public class Task_60 {
	
	public static void main(String[] args) {
		
		int integer = generateRandomThreeDigitInteger();
		System.out.println(integer);
		
		printReverseSortedDigits(integer);
		
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
	
	private static void printReverseSortedDigits(int number) {
		//sorts the digit of  the given number
		
		int[] digits = {getUnitsDigit(number), getTensDigit(number), getHundredsDigit(number)};
		
		Arrays.sort(digits);
		
		for(int i = digits.length - 1; i >= 0; i--) {
			System.out.print(digits[i] + " ");
		}
		
	}

}
