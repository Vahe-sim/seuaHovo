package Tasks_51_60;

import java.util.Random;

public class Task_58 {
	
	public static void main(String[] args) {
		
		int integer = generateRandomThreeDigitInteger();
		System.out.println(integer);
		
		char f = nameVariableF(integer);
		System.out.println(f);
		
	}

	private static int generateRandomThreeDigitInteger() {
		//Generates a three digit integer
		Random random = new Random();
		
		return random.nextInt(900) + 100;
	}
	
	
	private static int getTensDigit(int integer) {
		// gets an integer as an input and returns the tens digit of the given integer.
		
		return (integer / 10) % 10;
	}
	
	private static int getHundredsDigit(int integer) {
		// gets an integer as an input and returns the hundreds digit of the given integer.
		
		return (integer / 100) % 10;
	}
	
	private static char nameVariableF(int integer) {
		/*
		 * Gives the variable f value of 'a', if the sum of tens and hundreds digit of the number is less than 5.
		 * otherwise, the method gives the value of 'b' to f.
		*/
		
		if(getTensDigit(integer) + getHundredsDigit(integer) < 5) return 'a';
		else return 'b';
	}

}
