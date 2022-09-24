package com.te.fetchmiddlechar;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string:");
		String string = scanner.next();
		if(string.length()%2==0) {
			System.out.println(getMiddleChars(string));
		}
		else
			System.out.println("reeneter the value");
	}

}
