package com.te.vowelsarrayarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<String> arrayList = new ArrayList<String>();
		System.out.println("Enter the size of the array:");
		int size=scanner.nextInt();
		String[] str=new String[size];
		for (int i = 0; i < str.length; i++) {
			System.out.println("Enter the"+i+"th String element:");
			str[i]=scanner.next();
		}
		System.out.println(UserMainCode.matchCharacter(str));
		
		
	}
}
