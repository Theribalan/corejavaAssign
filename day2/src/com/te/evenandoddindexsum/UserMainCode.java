package com.te.evenandoddindexsum;

public class UserMainCode {
	public static int sumOfOddEvenPositioned(int n) {
		int temp = n;
		int temp1=n;
		
		int evensum = 0;
		int oddsum = 0;
		int rem1 = 0;
		int rem2 = 0;

		while (n > 0) {
			rem1 = n % 10;
			oddsum = oddsum + rem1;
			n = n / 100;

		}
		System.out.println(oddsum);
		temp=temp1/10;
		while (temp > 0) {
			rem2 = temp % 10;
			evensum = evensum + rem2;
			temp = temp / 100;
		}

		System.out.println(evensum);
		if (oddsum == evensum)
			return 1;
		else
			return -1;

	}

}
