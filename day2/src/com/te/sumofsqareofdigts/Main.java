package com.te.sumofsqareofdigts;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the input number");
		int n = scanner.nextInt();
		System.out.println(getSumOfSquaresOfDigits(n));		
		scanner.close();
	}

}
