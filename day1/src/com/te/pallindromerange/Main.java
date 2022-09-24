package com.te.pallindromerange;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the lower limit");
		int lower = scanner.nextInt();
		System.out.println("Enter the upper limit");
		int upper = scanner.nextInt();
		if(upper<10||lower<10)
			System.out.println("Enter valid upper or lower limit");
		else
			System.out.println(addPalindromes(lower,upper));
		
		
		scanner.close();
	}

}
