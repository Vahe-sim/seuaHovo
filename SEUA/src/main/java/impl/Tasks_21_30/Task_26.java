package main.java.impl.Tasks_21_30;

import java.util.Scanner;

public class Task_26 {
	
	public static void main(String[] args) {
		
		int[] nums = getArrayOfNumbers();
		
		containsEvenNumber(nums);
		
		
	}
	
	
	private static int[] getArrayOfNumbers() {
		//Creates an array of user generated input
		
		System.out.println("Please enter three numbers.");
		Scanner scanner = new Scanner(System.in);
		
		int a = 0, b = 0, c = 0;
		
		int[] array = {a, b, c};
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(String.format("Number %d) ", i+1));
			array[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		return array;
	}
	
	
	private static void containsEvenNumber(int[] array) {
		/*
		 * Checks whether the given array contains at least one even number
		 * Prints '1' if the array contains at least one even integer, and '2' otherwise
		 */
		
		//Variable assumes initially that the array does not contain an even number
		boolean containsEven = false;
				
				
		for(int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				containsEven = true;
				System.out.print(1);
				break;
			}
			
		}
		
		if (!containsEven) {
			System.out.print(2);
		}
	}
	

}
