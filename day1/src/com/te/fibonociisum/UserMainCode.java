package com.te.fibonociisum;

public class UserMainCode {
	public static int getSumOfNfibos(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		int temp=1;
		
		if (n == 1)
			return a;
		else if (n == 2)
			return a + b;
		else {
			
			n = n - 2;
			while (n >0) {
				
				c=a+b;
				temp=temp+c;
				a=b;
				b=c;
				n--;
				

			}

		}
		return temp;

	}

}
