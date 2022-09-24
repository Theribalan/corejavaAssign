package com.te.removingvowels;

public class UserMainCode {
	public static String removeEvenVowels (String string) {
		
		StringBuffer string2 = new StringBuffer(string.toLowerCase());
		for (int i = 1; i < string2.length(); i = i + 2) {
			if (string2.charAt(i) == 'a' || string2.charAt(i) == 'e' || string2.charAt(i) == 'i' || string2.charAt(i) == 'o'
					|| string2.charAt(i) == 'u') {
				string2.deleteCharAt(i);
				i--;
			}
		}
		String s3 = string2.toString();
		return s3;
		
		
	}

}
