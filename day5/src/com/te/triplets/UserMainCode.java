package com.te.triplets;

public class UserMainCode {
	public static boolean checkTripplet(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			if (count == 3) {
				return true;
			}
			// System.out.println("count"+count);
		}
		return false;
	}

}
