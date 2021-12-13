package main.java.impl.Tasks_21_30;

import java.util.Scanner;
import java.util.Arrays;

public class Task_25 {
	
	public static void main(String[] args) {
		
		int a = 0, b = 0, c = 0;
		
		int[] array = {a, b, c};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter three numbers.");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(String.format("Number %d) ", i+1));
			array[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		Arrays.sort(array);
		
		if (array[0] + array[1] > array[2]) {
			System.out.println("y = 1");
		}
		else {
			System.out.println("y = 2");
		}
		
	}

}
