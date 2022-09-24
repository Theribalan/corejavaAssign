package com.te.position;

import java.util.Arrays;
import java.util.Collections;

public class UserMainCode {
	public static int getElementPosition(String[] string1, String string2) {
	Arrays.sort(string1, Collections.reverseOrder());
			int i = 0;
			for (i = 0; i < string1.length; i++) {
				if (string1[i].equals(string2)) {
					i++;
					break;
				}
			}
			return i;
		}

	}


