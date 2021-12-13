package main.java.impl.Tasks_21_30;

import java.util.Scanner;
import java.util.Arrays;

public class Task_22 {
	
	public static void main(String[] args) {
		
		int a = 0, b = 0, c = 0;
		
		int[] nums = {a, b, c};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter three numbers.");
		
		for(int i = 0; i < 3; i++) {
			System.out.print(String.format("Number %d) ", i+1));
			nums[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		Arrays.sort(nums);;
		System.out.println("The smallest number is " + nums[0]);
		
	}

}
