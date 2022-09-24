package com.te.sumofnonprime;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number upto which we have to find the sum of non prime numbers:");
		int n = scanner.nextInt();
		System.out.println(addNumbers(n));
		
		scanner.close();
		
		
	}

}
