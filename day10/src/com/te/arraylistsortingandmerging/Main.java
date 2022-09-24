package com.te.arraylistsortingandmerging;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		System.out.println("Enter the list integers:");
		list.add(scanner.nextInt());
		list.add(scanner.nextInt());
		list.add(scanner.nextInt());
		list.add(scanner.nextInt());
		list.add(scanner.nextInt());
		// System.out.println("list:"+list);
		System.out.println("Enter the list2 integers:");
		list2.add(scanner.nextInt());
		list2.add(scanner.nextInt());
		list2.add(scanner.nextInt());
		list2.add(scanner.nextInt());
		list2.add(scanner.nextInt());
		// System.out.println("list2:"+list2);
		UserMainCode.sortMergedArrayList(list, list2);
		list3.add(list.get(2));
		list3.add(list.get(6));
		list3.add(list.get(8));
		System.out.println(list3);

	}

}
