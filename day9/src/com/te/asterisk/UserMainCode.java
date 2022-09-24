package com.te.asterisk;

public class UserMainCode {
	public static boolean scanStarNeighbors( String string) {
		String astrisk = "*";
		String  [] array = string.split("\\*");
		
		boolean boo = false ;
		for (int i = 0; i < array.length-1; i++) {
			
				if(array[i].charAt(array[i].length()-1)==array[i+1].charAt(0))
					boo = true;	
		
		}
		return boo;	
	}
}
