package com.te.remove3multiples;

import java.util.ArrayList;
import java.util.Iterator;

public class UserMainCode {
	public static ArrayList<Integer> removeMultiplesOfThree(ArrayList<Integer>arryList){
		for (int i = 2; i <arryList.size(); i=i+2) {
			arryList.remove(i);
		}
			return arryList;
		}
	}


