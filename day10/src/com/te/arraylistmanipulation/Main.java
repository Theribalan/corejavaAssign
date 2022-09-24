package com.te.arraylistmanipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();

		System.out.println("Enter the number of elements in each arraylist:");
		int number = scanner.nextInt();
		
		for (int i = 0; i < number; i++) {
			System.out.println("Enter " + i + "arraylist element:");
			arrayList.add(scanner.nextInt());
		}
		
		//System.out.println("size1:" + arrayList.size());
		for (int i = 0; i < number; i++) {
			System.out.println("Enter " + i + "arraylist1 element:");
			arrayList1.add(scanner.nextInt());
		}
		
		
		ArrayList<Integer> res = UserMainCode.generateOddEvenList(arrayList, arrayList1);
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}
	}

}
