package com.te.fetchmiddlechar;

public class UserMainCode {
public static String getMiddleChars(String string) {
	int position=string.length()/2-1;
	int position1=position+1;
	StringBuffer buffer=new StringBuffer();
	buffer.append(string.charAt(position)).append(string.charAt(position1));
	String string1=buffer.toString();
	return string1;
}
}
