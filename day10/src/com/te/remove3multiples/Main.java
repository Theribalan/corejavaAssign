package com.te.remove3multiples;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<Integer>arrayList=new ArrayList<Integer>();
		System.out.println("Enter the size of the array list:");
		int size=scanner.nextInt();
		for (int i = 1; i <=size; i++) {
			arrayList.add(scanner.nextInt());
		}
		System.out.println(UserMainCode.removeMultiplesOfThree(arrayList));	
	}

}
