package com.te.sequenceinarray;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size = scanner.nextInt();
		int[] array = new int[size];
		int[] array2 = { 1, 2, 3 };

		for (int i = 0; i < array.length; i++) {
			System.out.println("enter the" + i + "element:");
			array[i] = scanner.nextInt();
		}
		int result = sequence(array, array2);
		if (result == 1) {
			System.out.println("True");
		} else
			System.out.println("false");

		scanner.close();

	}

}
