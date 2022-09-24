package com.te.lastletters;

public class UserMainCode {
	public static String getLastLetter(String string) {
		String[] string1 = string.split(" ");
		String result = " ";

		for (int i = 0; i < string1.length; i++) {
			String temp=string1[i];
			result=result+temp.charAt(temp.length()-1)+"$";
					
		}
		result = result.substring(0, result.length() - 1);
		result = result.toUpperCase();
		return result;
	}

}
