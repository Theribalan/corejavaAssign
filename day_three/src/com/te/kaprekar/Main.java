package com.te.kaprekar;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the input number");
		int n = scanner.nextInt();
		int result =getKarprekarNumber(n);
		if(result==1)
			System.out.println("Kaprekar number");
		else
			System.out.println("not a kaprekar number");
	scanner.close();
	}
}
