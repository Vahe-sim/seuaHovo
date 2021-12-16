package main.java.impl.Tasks_21_30;

import java.util.Scanner;
import java.util.Arrays;


public class Task_28 {
	
	public static void main(String[] args) {
		
		int[] nums = getArrayOfNumbers();
		
		sortArray(nums); 
				
		checkGeometricProgression(nums);
		
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
	
	
	private static void checkGeometricProgression(int[] array) {
		//Checks whether the sequence of numbers is a geometric progression
		
		//finds the ratio of the first two terms in the array
		
		double mult = (double)array[1] / (double)array[0];
				
		//Assumes initially that the sequence is not a geometric progression
		boolean isGeomprogress = false;
				
				
		if (array[2] / array[1] == mult) {
			isGeomprogress = true;
			
		}
		System.out.println(isGeomprogress);
	}
	

}
