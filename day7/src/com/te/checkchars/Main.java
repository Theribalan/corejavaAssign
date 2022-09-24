package com.te.checkchars;

import java.util.Scanner;

public class Main extends UserMainCode{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String string = scanner.nextLine();
		int result=checkCharacters(string,string.length());
		if (result==1)
			System.out.println("valid");
		else
			System.out.println("invalid");
	}

}
