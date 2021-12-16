package main.java.impl.Tasks_21_30;

import java.util.Scanner;

public class Task_23 {

	public static void main(String[] args) {
		
		System.out.println("Please enter three numbers.");
		
		int[] nums = getArrayOfNumbers();
		
		
		//assumes that the given array of integers does not contain value '1'
		boolean isEqual = false;
		
		atLeastOne1(nums, isEqual);
		
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
	
	
	private static void atLeastOne1(int[] array, boolean condition) {
		/*checks whether the given array contains at least one value of '1'
		 outputs true if the condition is true, and false otherwise
		 */
		for(int i = 0; i < 3; i++) {
			if (array[i] == 1) {
				condition = true;
				System.out.println(condition);
				break;
			  }
		   }
		
		if (!condition) {
			System.out.println(condition);
		}
	}
	
	
}
