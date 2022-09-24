package com.te.newword;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string and integer:");
		String string = scanner.next();
		int int1 = scanner.nextInt();
		if (string.length() % 2 == 0 && string.length()>=2*int1) {
			String result = formNewWord(string, int1);
			System.out.println(result);
		}
		else
			System.out.println("Renter the string and integer ");
	}

}
