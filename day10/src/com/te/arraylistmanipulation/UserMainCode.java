package com.te.arraylistmanipulation;

import java.util.ArrayList;

public class UserMainCode {
	public static ArrayList<Integer> generateOddEvenList(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList1) {
		ArrayList<Integer> arrayList3 = new ArrayList<Integer>();


		for (int i = 0; i <arrayList1.size(); i=i+2) {
			arrayList3.add(arrayList1.get(i));
			
		}
		
		for (int i = 1; i <arrayList.size(); i=i+2) {
			arrayList3.add(i,arrayList.get(i));
			
		}
		
		//System.out.println(arrayList3);
		return arrayList3;

	}
}
