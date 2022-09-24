package com.te.programminglogic;

public class UserMainCode {
	public static int getLuckySum(int a,int b,int c) {
		if(a==13)
			return c;
		else if(b==13)
			return a;
		else if(c==13)
			return a+b;
		else
			return a+b+c;
	}

}
