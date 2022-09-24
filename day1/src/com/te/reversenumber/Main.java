package com.te.reversenumber;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input:");
		int n = scanner.nextInt();
		if (n < 0)
			System.out.println("Enter a valid input");
		else {
			System.out.println(reverseNumber(n));
		}
		scanner.close();
	}

}
