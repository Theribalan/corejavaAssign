package com.te.programminglogic;

import java.util.Scanner;

public class Main extends UserMainCode{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a = scanner.nextInt();
		System.out.println("Enter value of b:");
		int b = scanner.nextInt();
		System.out.println("Enter the value of c:");
		int c = scanner.nextInt();
		System.out.println(getLuckySum(a, b, c));
		scanner.close();
	}

	

}
