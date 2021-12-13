package main.java.impl.Tasks_31_40;

import java.util.Arrays;
import java.util.Scanner;

public class Task_39 {
	
public static void main(String[] args) {
		
		int a = 0, b = 0, c = 0, d = 0;
		int[] array = {a, b, c, d};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter three numbers.");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(String.format("Number %d) ", i+1));
			array[i] = scanner.nextInt();
		}
		scanner.close();
		
		Arrays.sort(array);
		//System.out.println(Arrays.toString(array));
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
