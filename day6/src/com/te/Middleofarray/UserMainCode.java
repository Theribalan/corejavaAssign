package com.te.Middleofarray;

public class UserMainCode {
	public static int getMiddleElement(int[] array) {
		int middleindex = 0;
		int middle = 0;
		for (int i = 0; i < array.length; i++) {
			// System.out.println(array[i]);

			middleindex = (array.length / 2);
			middle = array[middleindex];

		}
		System.out.println("middle element: " + middle);
		return 0;
	}

}
