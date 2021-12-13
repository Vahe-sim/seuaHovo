package main.java.impl.Tasks_21_30;

import java.util.Scanner;

public class Task_21 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object to read input from console
		
		System.out.println("Please enter the first number ");
		int a = scanner.nextInt();
		
		System.out.println("Please enter the second number ");
		int b = scanner.nextInt();
		
		System.out.println("Please enter the third number ");
		int c = scanner.nextInt();
		
		scanner.close();	// close the scanner - as no further console inputs required
		
		
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
