package com.te.lastletters;

import java.util.Scanner;

public class Main extends UserMainCode{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string or sentence");
		String string=scanner.nextLine();
		System.out.println(getLastLetter(string));
	}
}
