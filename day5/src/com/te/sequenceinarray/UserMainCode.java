package com.te.sequenceinarray;

public class UserMainCode {
	public static int sequence(int[] array, int[] array2) {
		int result = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array2.length; j++) {

				try {
					if (array2[i] == array[j]) {
						if (array2[i + 1] == array[j + 1]) {
							if (array2[i + 2] == array[j + 2]) {
								result = 1;

							}
						}

					}

				} catch (Exception e) {

					// TODO: handle exception
				}

			}

		}
		return result;

	}

}
