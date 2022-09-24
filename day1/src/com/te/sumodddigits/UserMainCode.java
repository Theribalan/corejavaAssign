package com.te.sumodddigits;

public class UserMainCode {
	
	public static int checkSum(int n) {
		 int rem=0;
		 int sum=0;
		while(n>0)
		{
			rem=n%10;
			if(rem%2==1)
			{
				sum=rem+sum;
			}
			
			n=n/10;
			
		}
		return sum;
	}

}
