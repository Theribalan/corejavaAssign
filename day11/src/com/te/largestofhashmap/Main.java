package com.te.largestofhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Map<Integer, String> map=new HashMap<Integer, String>();
		System.out.println("Enter the no of set:");
		int num=scanner.nextInt();
		for (int i = 1; i <=num; i++) {
			map.put(scanner.nextInt(), scanner.next());
			}
	//System.out.println(map);
	System.out.println(UserMainCode.getMaxKeyValue(map));
}
}
