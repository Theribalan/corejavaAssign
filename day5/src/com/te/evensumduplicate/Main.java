package com.te.evensumduplicate;

import java.util.Scanner;

public class Main extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size:");
		int size = scanner.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + i + "elements:");
			arr[i] = scanner.nextInt();
		}
		System.out.println(sumElements(arr));
		scanner.close();
	}
}
