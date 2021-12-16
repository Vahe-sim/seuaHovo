package main.java.impl.Tasks_31_40;

import java.util.Arrays;
import java.util.Scanner;

public class Task_35 {
	
public static void main(String[] args) {
		
		double[] array = getArrayOfNumbers();
	
		sortArray(array);
		
		sumOfThree(array);
		
		
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
	
	
	private static void sumOfThree(double[] array) {
		// Assumes initially that the sum of the first three numbers is not equal to the last number. 
		boolean condition = false;
				
		if(array[0] + array[1] + array[2] == array[3]) {
			condition = true;
			System.out.println(condition);
		}
		else {
			System.out.println(condition);
		}
	}

	
}
