package main.java.impl.Tasks_21_30;

import java.util.Scanner;

public class Task_24 {
	
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
	
	boolean twoTwoes = false;
	byte countTwoes = 0;
	
	for(int j = 0; j < 3; j++) {
		if (nums[j] == 2) {
			countTwoes += 1;
		}
	}
	
	if (countTwoes == 2) {
		twoTwoes = true;
		System.out.println(twoTwoes);
	}
	else {
		System.out.println(twoTwoes);
	}
	
	
  }
	
}


