package main.java.impl.Tasks_31_40;

import java.util.Scanner;

public class Task_36 {
	
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
		
		// Assumes initially that, of the four numbers, there are less than two odd numbers.  
		boolean condition = false;
		int countOdds = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 != 0) {
				countOdds += 1;
				if(countOdds == 2) {
					condition = true;
					System.out.println(condition);
					break;
				}
			}
		}
		

		
		if(!condition) {
			System.out.println(condition);
		}
		
		
   }

}
