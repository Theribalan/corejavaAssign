package com.te.pallindromerange;

public class UserMainCode {
	public static int addPalindromes(int lower, int upper) {
		int rem = 0;

		int sum = 0;

		for (int i = lower; i <= upper; i++) {
			int product = 0;
			int temp = i;
			while (temp > 0) {
				rem = temp % 10;
				product = product * 10 + rem;
				temp = temp / 10;
				if (product == i) {
					sum = sum + i;
				}

			}

		}

		return sum;
	}
}
