package com.te.sumofsqareofdigts;

public class UserMainCode {
	public static int getSumOfSquaresOfDigits(int n) {
		int sum=0;
		while(n>0) {
			int rem = n%10;
			sum=sum+rem*rem;
			n=n/10;
			
		}
		return sum;
	}

}
