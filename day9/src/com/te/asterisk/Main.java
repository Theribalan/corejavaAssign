package com.te.asterisk;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string  :");
		String str = scanner.next();
		System.out.println(scanStarNeighbors(str));
	}

}
