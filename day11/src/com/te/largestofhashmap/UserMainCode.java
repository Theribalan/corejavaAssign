package com.te.largestofhashmap;

import java.util.Map;
import java.util.TreeMap;

public class UserMainCode {
	public static String getMaxKeyValue(Map<Integer, String> map) {
		TreeMap<Integer, String> map2=new TreeMap<Integer, String>(map);
		System.out.println();
		return map2.get(map2.lastKey());

}
}