package com.te.fibonociisum;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the input:");
		int n = scanner.nextInt();
		if(n<0)
			System.out.println("enter valid input");
		else
			System.out.println(getSumOfNfibos(n));
		scanner.close();
	}

}
