package com.te.span;

public class UserMainCode {
	public static int getLargestSpan(int[] array) {

		int start = 0;
		int end = 0;
		int len1 = array.length;
		int len2 = array.length;
		for (int i = 0; i < len1; i++) {

			for (int j = 0; j < len2; j++) {
				if ((array[i] == array[j])) {
					start = i;
					end = j;
					len1 = i;

				}

			}
		}
		return (end - start) + 1;
	}
}
