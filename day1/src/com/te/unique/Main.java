package com.te.unique;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input");
		int n = scanner.nextInt();
		int result = getUnique(n);
		if (result == 1)
			System.out.println("unique");
		else
			System.out.println("not unique");
		scanner.close();
	}

}
