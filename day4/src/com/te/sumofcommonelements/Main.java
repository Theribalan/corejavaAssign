package com.te.sumofcommonelements;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of first array:");
		int size1 = scanner.nextInt();
		int[] array1 = new int[size1];
		System.out.println("Enter the array Element:");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = scanner.nextInt();

		}
		System.out.println("Enter the size of second array:");
		int size2 = scanner.nextInt();
		int[] array2 = new int[size2];
		System.out.println("Enter the array Element:");
		for (int i = 0; i < array2.length; i++) {

			array2[i] = scanner.nextInt();

		}
		System.out.println(sumCommonElements(array1, array2));
		scanner.close();
	}

}
