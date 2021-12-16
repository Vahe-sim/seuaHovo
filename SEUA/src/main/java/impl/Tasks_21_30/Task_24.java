package main.java.impl.Tasks_21_30;

import java.util.Scanner;

public class Task_24 {
	
	public static void main(String[] args) {
		
		int[] nums = getArrayOfNumbers();
		
		//counts the number of '2's in the array
		int countTwoes = countNumberOfTwoes(nums);
		
		exactlyTwoTwoes(countTwoes);
		
  }
	
	
	private static int[] getArrayOfNumbers() {
		//Creates an array of user generated input
		
		System.out.println("Please enter three numbers.");
		Scanner scanner = new Scanner(System.in);
		
		int a = 0, b = 0, c = 0;
		
		int[] array = {a, b, c};
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(String.format("Number %d) ", i+1));
			array[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		return array;
	}
	
	
	private static int countNumberOfTwoes(int[] array) {
		//Counts the number of twos in the array
		int countTwoes = 0;
		for(int j = 0; j < 3; j++) {
			if (array[j] == 2) {
				countTwoes += 1;
			}
		}
		
		return countTwoes;
	}
	
	
	private static void exactlyTwoTwoes(int countTwoes) {
		//Checks whether the array has exactly two '2's
		
		//variable assumes initially that the array does not contain two '2's
		boolean twoTwoes = false;
				
		if (countTwoes == 2) {
			twoTwoes = true;
			System.out.println(twoTwoes);
		}
		else {
			System.out.println(twoTwoes);
		}
	}
	
	
}


