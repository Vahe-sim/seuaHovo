package main.java.impl.Tasks_21_30;

import java.util.Scanner;

public class Task_21 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = inputInteger();
		int b = inputInteger();
		int c = inputInteger();
		
		scanner.close();
		
		getTheLargestInteger(a, b, c);
		
	}
	
	
	private static int inputInteger() {
		//reads from console an integer and assigns the value to the variable.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a number.");
		
		int num = scanner.nextInt();	
		
		
		return num;
	}
	
	private static void getTheLargestInteger(int a, int b, int c) {
		// finds the largest integer among three integers.
		if (a > b) {
			if (a > c)
				System.out.println(a);		
		}
		else {
			if (b > c) System.out.println(b);
			else System.out.println(c);
		}
	}

	
}
