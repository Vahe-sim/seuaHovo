package main.java.impl.Tasks_31_40;

import java.util.Arrays;
import java.util.Scanner;

public class Task_38 {
	
public static void main(String[] args) {
		
		double[] nums = getArrayOfNumbers();
		
		sortArray(nums);
		
		checkGeometricProgression(nums);
		
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
	
	private static void checkGeometricProgression(double[] array) {
		//Checks whether the sequence of numbers is a geometric progression
		
		//finds the ratio of the first two terms in the array
				
		double mult = array[1] / array[0];
						
		//Assumes initially that the sequence is a geometric progression
		boolean isGeomprogress = true;
		
		for(int i = 1; i < array.length - 1; i++) {
			if(array[i+1] / array[i] != mult) isGeomprogress = false;
			break;
		}
		
		System.out.println(isGeomprogress);
		
	}

}
