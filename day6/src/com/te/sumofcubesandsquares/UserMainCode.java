package com.te.sumofcubesandsquares;

public class UserMainCode {
	public static int addEvenOdd(int[] array) {
		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0)
				array[i] = array[i] * array[i];
			else
				array[i] = array[i] * array[i] * array[i];

		}
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}

		// System.out.println("sum"+sum);
		return sum;
	}

}
