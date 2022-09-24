package com.te.largestelement;

public class UserMainCode {
	public static int checkLargestAmongCorner(int[] array) {
		int first = 0;
		int middle = 0;
		int middleindex = 0;
		int last = 0;
		int lastindex = 0;
		for (int i = 0; i < array.length; i++) {
			// System.out.println(array[i]);
			first = array[0];
			middleindex = (array.length / 2);
			middle = array[middleindex];
			lastindex = array.length - 1;
			last = array[lastindex];

		}
//		System.out.println("first"+first);
//		System.out.println("middle"+middle);
//		System.out.println("last"+last);
		System.out.println((first > middle && first > last) ? first : (middle > last) ? middle : last);
		return 0;
	}

}
