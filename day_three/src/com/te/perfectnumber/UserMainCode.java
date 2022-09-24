package com.te.perfectnumber;

public class UserMainCode {
	public static boolean getPerfection(int num) {
		int temp=num;
		int sum=0;
		for (int i = 1; i <num; i++) {
			if(num%i==0) {
				sum=sum+i;
				
			}
				
		}
	//	System.out.println(sum);
		if(temp==sum)
			return true;
		else
			return false;
		
	}

}
