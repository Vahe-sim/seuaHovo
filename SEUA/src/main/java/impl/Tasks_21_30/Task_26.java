package main.java.impl.Tasks_21_30;

import java.util.Scanner;

public class Task_26 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = 0, b = 0, c = 0;
		
		int[] array = {a, b, c};
		System.out.println("Please enter three numbers.");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(String.format("Number %d) ", i+1));
			array[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		boolean containsEven = false;
		
		for(int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				containsEven = true;
				System.out.print(1);
				break;
			}
			
		}
		
		
		if (!containsEven) {
			System.out.print(2);
		}
		
		
	}

}
