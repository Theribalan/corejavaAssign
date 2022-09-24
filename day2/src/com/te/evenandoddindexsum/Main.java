package com.te.evenandoddindexsum;

import java.util.Scanner;

public class Main extends UserMainCode{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value");
		int n = scanner.nextInt();
		if(sumOfOddEvenPositioned(n)==1)
			System.out.println("yes");
		else
		{
			System.out.println("no");
		}
			
		
		scanner.close();
	}

	
}
