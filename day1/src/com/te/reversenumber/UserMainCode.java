package com.te.reversenumber;

public class UserMainCode {
	public static int reverseNumber(int n) {
		int rem = 0;
		int product = 0;
		while (n > 0) {
			rem = n % 10;
			product = product * 10 + rem;
			n = n / 10;
		}
		return product;
	}
}
