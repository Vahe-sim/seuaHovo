package main.java.impl.Tasks_31_40;

import java.util.Arrays;
import java.util.Scanner;

public class Task_40 {
	
	public static void main(String[] args) {
			
			double[] nums = getArrayOfNumbers();
			
			printReverseSortedArray(nums);
			
		}

	private static double[] getArrayOfNumbers() {
		//Creates an array of user generated input
		
		System.out.println("Please enter three numbers.");
		Scanner scanner = new Scanner(System.in);
		
		double a = 0, b = 0, c = 0, d = 0;
		
		double[] array = {a, b, c, d};
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(String.format("Number %d) ", i+1));
			array[i] = scanner.nextDouble();
		}
		
		scanner.close();
		
		return array;
	}
	
	
	private static void printReverseSortedArray(double[] array) {
		//Prints the array in descending order
		
		Arrays.sort(array);
		
		for(int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		
	}

	
}
