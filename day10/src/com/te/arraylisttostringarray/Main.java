package com.te.arraylisttostringarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<String>arrayList=new ArrayList<String>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of String array:");
		int size=scanner.nextInt();
		String [] str=new String[size];
		for (int i = 0; i < str.length; i++) {
			System.out.println("Enter the"+i+"element:");
			str[i]=scanner.next();
		}
		for (int i = 0; i < str.length; i++) {
			arrayList.add(str[i]);
		}
		//System.out.println(arrayList);
		String[]str3=UserMainCode.convertToStringArray(arrayList);
		for (int i = 0; i < str3.length; i++) {
			System.out.println(str3[i]);
		}
		
		
	}

}
