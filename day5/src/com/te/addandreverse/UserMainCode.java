package com.te.addandreverse;

public class UserMainCode {
	public static int addAndReverse(int[] array, int size, int input) {
		int sum = 0;
		int result1 = 0;
		int num = 0;
		int rem = 0;
		int product = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] > input) {
				sum = sum + array[i];
			}
		}
		num = sum;
		while (num > 0) {
			rem = num % 10;
			product = product * 10 + rem;
			num = num / 10;

		}
		// System.out.println("product"+product);
		result1 = product;

		return result1;
	}

}
