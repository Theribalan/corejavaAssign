package com.te.removingvowels;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string :");
		String string = scanner.next();
		String result = removeEvenVowels(string);
		System.out.println(result);
		
	}

}
