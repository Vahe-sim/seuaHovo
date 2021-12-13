package main.java.impl.Tasks_21_30;

import java.util.Scanner;
import java.util.Arrays;

public class Task_27 {
	
	public static void main(String[] args) {
		
		int a = 0, b = 0, c = 0;
		int[] array = {a, b, c};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter three numbers.");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(String.format("Number %d) ", i+1));
			array[i] = scanner.nextInt();
		}
		scanner.close();
		
		Arrays.sort(array);
		int difference = array[1] - array[0];
		boolean isProgress = false;
		
		if (array[2] - array[1] == difference) {
			isProgress = true;
			System.out.println(isProgress);
		}
		else {
			System.out.println(isProgress);
		}
		
		
	}

}
