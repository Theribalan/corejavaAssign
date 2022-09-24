package com.te.averageofprimeloc;

import java.text.DecimalFormat;

public class UserMainCode {
	public static double averageElements(int[] array) {
		int count = 0;
		int count1 = 0;
		int sum = 0;
		for (int i = 1; i < array.length; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0)
					count++;
				if (count > 2)
					break;
			}
			if (count == 2) {
				count1++;
				sum = array[i] + sum;
			}
		}
		double res=(double)sum/count1;
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		double result=Double.parseDouble(decimalFormat.format(res));
		//System.out.println(sum);
		return result;
	}
}
