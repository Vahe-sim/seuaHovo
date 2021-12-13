package main.java.impl.Tasks_31_40;

import java.util.Arrays;
import java.util.Scanner;

public class Task_33 {
	
	public static void main(String[] args) {
		
		double a = 0, b = 0, c = 0, d = 0;
		
		double[] array = {a, b, c, d};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter four numbers.");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(String.format("Enter number %d) ", i+1));
			array[i] = scanner.nextDouble();
		}
		
		scanner.close();
		Arrays.sort(array);
		
		/*
		 Applies binary search algorithm, to check whether the specified value,
		 in this case 1, is contained inside the array.
		 */
		
		System.out.println(Arrays.binarySearch(array, 1) == 0);

		}

}
