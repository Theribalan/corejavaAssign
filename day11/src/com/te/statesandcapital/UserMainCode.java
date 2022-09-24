package com.te.statesandcapital;


import java.util.Map;

public class UserMainCode {
	static String getCapital(Map<String, String> map, String str) {

		String res = map.get(str) + "$" + str;

		return res;
	}
}
