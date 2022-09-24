package com.te.arraylisttostringarray;

import java.util.ArrayList;
import java.util.Collections;

public class UserMainCode {
	public static String[] convertToStringArray (ArrayList<String> arrayList) {
		
		
		Collections.sort(arrayList);
		String[] str2= arrayList.toArray(new String[arrayList.size()]);
		return str2;
	}

}
