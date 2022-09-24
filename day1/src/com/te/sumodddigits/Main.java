package com.te.sumodddigits;

import java.util.Scanner;



public class Main extends UserMainCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input:");
		int n = scanner.nextInt();
		if (n < 0)
			System.out.println("Enter the valid input");
		else {
			if(checkSum(n)%2==0)
				
			System.out.println("Sum of the digits is Even");
			else
				System.out.println("Sum of the digits is odd");
			
			

		}

		scanner.close();

	}

}
