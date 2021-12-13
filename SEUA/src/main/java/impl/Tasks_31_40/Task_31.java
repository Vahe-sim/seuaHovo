package main.java.impl.Tasks_31_40;

import java.util.Arrays;
import java.util.Scanner;

public class Task_31 {
	
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
		
		System.out.print("Maximum number: " + array[array.length-1]);
		
	}

}
