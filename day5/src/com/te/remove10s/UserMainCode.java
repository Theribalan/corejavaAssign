package com.te.remove10s;

public class UserMainCode {
	static int[] removeTens(int array[]) {

		for (int i = 0; i < array.length; i++) {

			if (array[i] == 10)
				array[i] = 0;
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				for (int j = i; j < array.length; j++) {
					if (array[j] != 0) {
						array[i] = array[j];
						array[j] = 0;
						i++;
					}
				}
			}
		}

		return array;
	}
}
