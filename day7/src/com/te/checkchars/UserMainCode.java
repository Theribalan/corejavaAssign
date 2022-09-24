package com.te.checkchars;

public class UserMainCode {
	public static int checkCharacters(String string,int length) {
		String first=string.substring(0, 1);
		String second=string.substring(length-1);
		System.out.println(first);
		System.out.println(second);
		if(first.equalsIgnoreCase(second))
			return 1;
		else
			return -1;
	}
	

}
