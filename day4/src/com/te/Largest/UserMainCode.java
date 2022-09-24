package com.te.Largest;

public class UserMainCode {
	public static int checkLargestAmongCorner(int[] array) {

		int first = array[0];
		// System.out.println("first"+first);
		int middleposition = (array.length / 2);
		int lastposition = array.length - 1;
		int middle = array[middleposition];
		// System.out.println("middle:"+middle);
		int last = array[lastposition];
		// System.out.println("last:"+last);

		System.out.println("largest:" + ((first > middle && first > middle) ? first : (middle > last) ? middle : last));
		return 1;

	}
}
