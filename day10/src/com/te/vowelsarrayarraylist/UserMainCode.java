package com.te.vowelsarrayarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserMainCode {
	public static ArrayList<String> matchCharacter(String[] str) {
		ArrayList<String> arrayList = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
			for (int j = 0; j < str[i].length(); j++) {
				
				if ((str[i].charAt(0) == 'a' || str[i].charAt(0) == 'e' || str[i].charAt(0) == 'i'
						|| str[i].charAt(0) == 'o' || str[i].charAt(0) == 'u')
						&& ((str[i].charAt(str[i].length() - 1)) == 'a' || (str[i].charAt(str[i].length() - 1)) == 'e'
								|| (str[i].charAt(str[i].length() - 1)) == 'i'
								|| (str[i].charAt(str[i].length() - 1)) == 'o'
								|| (str[i].charAt(str[i].length() - 1)) == 'u')) {

					arrayList.add(str[i]);
					break;

				}
			}
		}
		return arrayList;

	}

}
