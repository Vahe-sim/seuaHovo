package main.java.impl.Tasks_31_40;

import java.util.Scanner;
import java.util.Arrays;

public class Task_34 {
	
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
		
		// Assumes initially that the sum of any given two numbers is not equal to that of the other two. 
		boolean condition = false;
		
		if(array[0] + array[2] == array[1] + array[3]) {
			condition = true;
			System.out.println(condition);
		}
		else if(array[0] + array[3] == array[1] + array[2]) {
			condition = true;
			System.out.println(condition);
		}
		else {
			System.out.println(condition);
		}
		
		
	}

}
