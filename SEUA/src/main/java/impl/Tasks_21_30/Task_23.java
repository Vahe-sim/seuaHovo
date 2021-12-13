package main.java.impl.Tasks_21_30;

import java.util.Scanner;

public class Task_23 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in); // create scanner object to read input from console
		
		System.out.println("Please enter the first number ");
		int a = scanner.nextInt();
		
		System.out.println("Please enter the second number ");
		int b = scanner.nextInt();
		
		System.out.println("Please enter the third number ");
		int c = scanner.nextInt();
		
		scanner.close();
		
		boolean isEqual = false;
		
		int x[] = {a, b, c};
		
		for(int i = 0; i < 3; i++) {
			if (x[i] == 1) {
				isEqual = true;
				System.out.println(isEqual);
				break;
			  }
		   }
		if (!isEqual) {
			System.out.println(isEqual);
		}	
	}
}
