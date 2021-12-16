package main.java.impl.Tasks_21_30;

import java.util.Scanner;
import java.util.Arrays;

public class Task_30 {
	
	public static void main(String[] args) {
		
		int[] nums = getArrayOfNumbers();
		
		printReverseSortedArray(nums);
		
		
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
	
	
	private static void printReverseSortedArray(int[] array) {
		//Prints the array in descending order
		
		Arrays.sort(array);
		
		for(int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		
	}
	

}
