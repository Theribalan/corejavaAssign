package com.te.sumofcommonelements;

public class UserMainCode {
	public static int sumCommonElements(int[] array1, int[] array2) {

		int sum = 0;

		for (int i = 0; i < array1.length; i++) {

			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					sum = sum + array1[i];
				}
				else
					return -1;
			}

			// System.out.println("sum" + sum);

		}
		return sum;

	}

}
