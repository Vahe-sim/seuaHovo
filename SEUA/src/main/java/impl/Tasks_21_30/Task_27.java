package main.java.impl.Tasks_21_30;

import java.util.Scanner;
import java.util.Arrays;

public class Task_27 {
	
	public static void main(String[] args) {
		
		int[] nums = getArrayOfNumbers();
		
		sortArray(nums);
		
		checkArithmeticProgression(nums);
				
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
	
	
	private static void checkArithmeticProgression(int[] array) {
		//Checks whether the sequence of numbers is an arithmetic progression
		
		//finds the difference of the first two terms of the array
		int difference = array[1] - array[0];
				
		//Variable assumes initially that the given numbers do not form arithmetic progression
		boolean isProgress = false;
				
				
		if (array[2] - array[1] == difference) isProgress = true;
			
		System.out.println(isProgress);
	}
	

}
