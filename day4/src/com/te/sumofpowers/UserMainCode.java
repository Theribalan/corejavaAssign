package com.te.sumofpowers;

public class UserMainCode {
	public static int power(int num, int count) {
		int product = 1;
		for (int i = 0; i <count; i++) {
			product = product * num;
			//System.out.println("product :" + product);
		}
		

		return product;
	}

	public static int getSumOfPower(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {

			sum = sum + power(array[i], i);
			//System.out.println("sum:" + sum);
		}

		//System.out.println("total sum=" + sum);
		return sum;
	}
}
