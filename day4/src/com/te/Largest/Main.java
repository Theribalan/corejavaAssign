package com.te.Largest;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		if (size % 2 != 0) {
			int[] array = new int[size];
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter the" + i + " element:");
				array[i] = scanner.nextInt();

			}

			checkLargestAmongCorner(array);
		}

		else
			System.out.println("Reexecute the program with odd size");
		scanner.close();
	}

}
