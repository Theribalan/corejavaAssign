package com.te.perfectnumber;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number to find perfect or not");
		int num = scanner.nextInt();
		System.out.println(getPerfection(num));
		scanner.close();
		
	}

}
