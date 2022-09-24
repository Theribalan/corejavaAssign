package com.te.remove10s;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter " + i + "element:");
			array[i] = scanner.nextInt();
		}
		int[] res = (removeTens(array));
		for (int i = 0; i < res.length; i++) {

			System.out.println(res[i]);
		}

		scanner.close();

	}

}
