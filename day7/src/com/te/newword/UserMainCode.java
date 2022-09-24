package com.te.newword;

public class UserMainCode {
	public static String formNewWord(String string, int int1) {
		int length = string.length();
		String string2 = string.substring(0, int1);
		// System.out.println(string2);
		String string3 = string.substring(length - int1, length);
		// System.out.println(string3);
		String string4 = string2 + string3;

		return string4;

	}

}
