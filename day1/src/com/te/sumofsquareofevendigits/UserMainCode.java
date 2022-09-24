package com.te.sumofsquareofevendigits;

public class UserMainCode {
	public static int sumOfSquaresOfEvenDigits(int n) {
		int rem = 0;
		int sum = 0;

		while (n > 0) {
			rem = n % 10;
			if (rem % 2 == 0) {
				sum = sum + rem * rem;
			} 

			
			n = n / 10;
		}
		return sum;

	}

}
