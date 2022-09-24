
package com.te.digits;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input");
		int n = scanner.nextInt();
		if (n < 0)
			System.out.println("Enter the valid input");
		else {
			System.out.println("Occurance:" + countSeven(n));
		}
		scanner.close();
	}

}
