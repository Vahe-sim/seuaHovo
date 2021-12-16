package main.java.impl.Tasks_21_30;

import java.util.Scanner;
import java.util.Arrays;

public class Task_25 {
	
	public static void main(String[] args) {
		
		int[] nums = getArrayOfNumbers();
		
		sortArray(nums);
		
		possibleToMakeTriangle(nums);
		
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
	
	
	private static void sortArray(int[] array) {
		//returns sorted array
		
		Arrays.sort(array);
	}
	
	private static void possibleToMakeTriangle(int[] array) {
		/**
		 * Checks whether it is possible to make a traingle with those three integers
		 * Prints 'y = 1' if it is possible to make a triangle, and 'y=2' otherwise
		 */
		
		if (array[0] + array[1] > array[2]) {
			System.out.println("y = 1");
		}
		else {
			System.out.println("y = 2");
		}
	}

}
