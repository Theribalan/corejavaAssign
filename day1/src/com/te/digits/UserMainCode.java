package com.te.digits;

public class UserMainCode {
	public static int countSeven(int n) {
		int rem = 0;
		int count = 0;
		while (n > 0) {
			rem = n % 10;
			if (rem == 7) {
				count++;
			} 
			n = n / 10;

		}
		return count;
	}

}
