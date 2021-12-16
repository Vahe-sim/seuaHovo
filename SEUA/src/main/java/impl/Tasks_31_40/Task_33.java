package main.java.impl.Tasks_31_40;

import java.util.Arrays;
import java.util.Scanner;

public class Task_33 {
	
	public static void main(String[] args) {
		
		double[] array = getArrayOfNumbers();
		
		// Contains the value that we want to check whether it is contained inside the array
		double targetValue = 1;
		
		sortArray(array);
		
		binarySearch(array, targetValue);

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
 
 
	private static void sortArray(double[] array) {
		//returns sorted array
		
		Arrays.sort(array);
	}
	
	
	private static void binarySearch(double[] array, double targetValue) {
		/*
		 Applies binary search algorithm, to check whether the specified value,
		 in this case 1, is contained inside the array.
		 */
		
		System.out.println(Arrays.binarySearch(array, targetValue) == 0);
		
	}

	
}
