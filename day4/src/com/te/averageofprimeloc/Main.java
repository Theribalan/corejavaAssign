package com.te.averageofprimeloc;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the" + i + " element:");
			array[i] = scanner.nextInt();

		}
		double result1 = averageElements(array);
		System.out.println(result1);
		scanner.close();
	}

}
