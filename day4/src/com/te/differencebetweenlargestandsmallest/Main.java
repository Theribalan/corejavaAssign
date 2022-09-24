package com.te.differencebetweenlargestandsmallest;

import java.util.Scanner;

public class Main extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter" + i + " element:");
			array[i] = scanner.nextInt();
		}
		System.out.println("Difference:" + getBigDif(array));

		scanner.close();
	}

}
