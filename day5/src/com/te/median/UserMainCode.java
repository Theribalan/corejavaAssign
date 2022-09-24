package com.te.median;

import java.util.Arrays;

public class UserMainCode {
	public static int calculateMedian(int[] array, int size) {
		double Median = 0;
		int result = 0;
		Arrays.sort(array);
		int x = array.length / 2;
		int y = (array.length / 2) -1;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("sorted:");
			 System.out.println(array[i]);
			if (size % 2 == 0) {

				Median = (Math.ceil((array[x] + array[y]) / 2.0));
			}

			else {
				Median = array[x];

			}

		}
		result = (int) Median;
		// System.out.println("median:"+Median);

		return result;
	}

}