package main.java.impl.Tasks_31_40;

import java.util.Arrays;
import java.util.Scanner;

public class Task_37 {
	
	public static void main(String[] args) {
		
		double[] nums = getArrayOfNumbers();
		
		sortArray(nums);
		
		checkArithmeticProgression(nums);
		
	}
	
	private static double[] getArrayOfNumbers() {
		//Creates an array of user generated input
		
		System.out.println("Please enter three numbers.");
		Scanner scanner = new Scanner(System.in);
		
		double a = 0, b = 0, c = 0, d = 0;
		
		double[] array = {a, b, c, d};
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(String.format("Number %d) ", i+1));
			array[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		return array;
	}
	
	
	private static void sortArray(double[] array) {
		//returns sorted array
		
		Arrays.sort(array);
	}
	
	private static void checkArithmeticProgression(double[] array) {
		//Checks whether the sequence of numbers is an arithmetic progression
		
		//finds the difference of the first two terms of the array
		double difference = array[1] - array[0];
				
		//Variable assumes initially that the given numbers form arithmetic progression
		boolean isProgress = true;
		
		for(int i = 1; i < array.length-1; i++) {
			if(array[i+1] - array[i] != difference) {
				isProgress = false;
				break;
			}
		}
		
		System.out.println(isProgress);
		
	}

}
